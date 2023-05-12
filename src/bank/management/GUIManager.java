package bank.management;

import bank.management.gui.*;
import bank.management.transaction.BillPaymentHandler;
import bank.management.transaction.FundTransferHandler;
import bank.management.transaction.MoblieRechargeHandler;
import bank.management.transaction.WithdrawHandler;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Osama
 */
public class GUIManager {

    public static final long LOGIN_CACHE_TIME = 30 * 60 * 1000;
    private final Navigator navigator;

    final Splash splash;
    final LoginScreen loginScreen;
    final ClientComplainPage clientComplainPage;
    final ClientFundTransfer clientFundTransfer;
    final ClientMobileRecharge clientMobileRecharge;
    final ClientProfile clientProfile;
    final ClientStatement clientStatement;
    final ClientUtilityBill clientUtilityBill;
    final ClientWithdrawCash clientWithdrawCash;
    final Complains complains;
    final ManagerClientInfo managerClientInfo;
    final ManagerDashboard managerDashboard;
    final ManagerHomepage managerHomepage;
    
    private Client userClient;

    private final DBManager dbManager;

    public GUIManager() throws InterruptedException {
        this.navigator = new Navigator();
        this.dbManager = new DBManager();

        this.splash = new Splash(this);
        this.loginScreen = new LoginScreen(this);
        this.clientComplainPage = new ClientComplainPage(this);
        this.clientFundTransfer = new ClientFundTransfer(this);
        this.clientMobileRecharge = new ClientMobileRecharge(this);
        this.clientProfile = new ClientProfile(this);
        this.clientStatement = new ClientStatement(this);
        this.clientUtilityBill = new ClientUtilityBill(this);
        this.clientWithdrawCash = new ClientWithdrawCash(this);
        this.complains = new Complains(this);
        this.managerClientInfo = new ManagerClientInfo(this);
        this.managerDashboard = new ManagerDashboard(this);
        this.managerHomepage = new ManagerHomepage(this);     

        this.splash.setAllListeners();
        this.clientComplainPage.setAllListeners();
        this.clientFundTransfer.setAllListeners();
        this.clientMobileRecharge.setAllListeners();
        this.clientProfile.setAllListeners();
        this.clientStatement.setAllListeners();
        this.clientUtilityBill.setAllListeners();
        this.clientWithdrawCash.setAllListeners();
        this.complains.setAllListeners();
        this.managerClientInfo.setAllListeners();
        this.managerDashboard.setAllListeners();
        this.managerHomepage.setAllListeners();
        this.loginScreen.setAllListeners();

        loadTransactions();
        loadManagerClientInfoData();
        loadComplains();
        
    }
    
    public void init() {
        navigator.navigate(splash);
    }

    public Splash getSplash() {
        return splash;
    }

    public LoginScreen getLoginScreen() {
        return loginScreen;
    }

    public ClientComplainPage getClientComplainPage() {
        return clientComplainPage;
    }

    public ClientFundTransfer getClientFundTransfer() {
        return clientFundTransfer;
    }

    public ClientMobileRecharge getClientMobileRecharge() {
        return clientMobileRecharge;
    }

    public ClientProfile getClientProfile() {
        return clientProfile;
    }

    public ClientStatement getClientStatement() {
        return clientStatement;
    }

    public ClientUtilityBill getClientUtilityBill() {
        return clientUtilityBill;
    }

    public ClientWithdrawCash getClientWithdrawCash() {
        return clientWithdrawCash;
    }

    public Complains getComplains() {
        return complains;
    }

    public ManagerClientInfo getManagerClientInfo() {
        return managerClientInfo;
    }

    public ManagerDashboard getManagerDashboard() {
        return managerDashboard;
    }

    public Client getUserClient() {
        return userClient;
    }

    public Navigator getNavigator() {
        return navigator;
    }

    public DBManager getDBManager() {
        return dbManager;
    }

    public void setUserClient(Client userClient) {
        this.userClient = userClient;
    }



    public ManagerHomepage getManagerHomepage() {
        return managerHomepage;
    }

    public void loadCachedLoginInfo() throws IOException, FileNotFoundException, ClassNotFoundException, UnsupportedEncodingException {     
        dbManager.loadLoginInfo();
        LoginInfo loginInfo = dbManager.getLoginInfo();
        Date prev = loginInfo.getDate();
        Date now = new Date();
        long timeDiff = now.getTime() - prev.getTime();
        if (timeDiff <= GUIManager.LOGIN_CACHE_TIME) {
            String username = loginInfo.getUsername();
            String password = loginInfo.getPassword();
            
            System.out.println(username+ " " + password);
            
            if (username.equals("admin") && password.equals("admin")) {
                updateLoginInfo();
                navigator.navigate(managerHomepage);
                splash.dispose();
                return;
            }

            try {
                loginUser(username, password);
            } catch (UserNotFoundException ex) {
                navigator.navigate(loginScreen);
                splash.dispose();
            }
        } else {
            navigator.navigate(loginScreen);
            splash.dispose();
        }
    }
    
    public void updateLoginInfo() throws IOException, FileNotFoundException, UnsupportedEncodingException, ClassNotFoundException {
        updateLoginInfo("admin", "admin");
    }

    public void updateLoginInfo(String username, String password) throws IOException, FileNotFoundException, UnsupportedEncodingException, ClassNotFoundException {
        dbManager.setLoginInfo(new LoginInfo(username, password));
        dbManager.updateLoginInfo();
    }
    
    public void loginUser(String username, String password) throws IOException, FileNotFoundException, ClassNotFoundException, UserNotFoundException {
        dbManager.loadClientDB();
        
        boolean notFound = true;
        for (Client client : dbManager.getClientDB()) {
            if (client.getUsername().equals(username)) {
                userClient = client;
                notFound = false;
            }
        }
        if (notFound) throw new UserNotFoundException();
        loadClientTransactions();
        updateCurrentBalance();
        loadClientName();
        navigator.navigate(clientProfile);
        updateLoginInfo(username, password);
    }
    
    public void loadClientName() {
        clientProfile.getClientName().setText(userClient.getName());
        clientStatement.getClientName().setText(userClient.getName());
        clientMobileRecharge.getClientName().setText(userClient.getName());
        clientUtilityBill.getClientName().setText(userClient.getName());
        clientWithdrawCash.getClientName().setText(userClient.getName());
        clientComplainPage.getClientName().setText(userClient.getName());
    }
    
    public void loadComplains() {
        try {
            dbManager.loadComplainDB();
        } catch (IOException ex) {
            Logger.getLogger(GUIManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        String complainListString = new String();
        for (Complain complain : dbManager.getComplainDB()) {
            complainListString += "-------------------------------------------------------------------------------\n"
                    + complain.getOwner().getName() + ":\n"
                    + complain.getBody() + "\n\n"
                    + "-------------------------------------------------------------------------------\n";
        }
        System.out.println("Complains:\n" + complainListString);
        complains.getComplainList().setText(complainListString);
    }
    
    public void loadTransactions() {
        JTable table = managerDashboard.getTransactionList();
        TableModel model = table.getModel();
        try {
            dbManager.loadTransactionDB();
            ArrayList<Transaction> transactionDB = dbManager.getTransactionDB();
            for (int i = 0; i < transactionDB.size(); i++) {
                Transaction transaction = transactionDB.get(i);
                model.setValueAt(i + 1, i, 0);
                model.setValueAt(transaction.getSender().getName(), i, 1);
                model.setValueAt(transaction.getDate(), i, 2);
                model.setValueAt(transaction.getAmount(), i, 3);
                model.setValueAt(transaction.getReceiver().getName(), i, 4);
                model.setValueAt(transaction.getType(), i, 5);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void loadClientTransactions() {
        JTable table = clientStatement.getClientTransactionsTable();
        TableModel model = table.getModel();
        ArrayList<Transaction> transactions = userClient.getTransactionList();
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            model.setValueAt(i + 1, i, 0);
            model.setValueAt(transaction.getSender().getName(), i, 1);
            model.setValueAt(transaction.getDate(), i, 2);
            model.setValueAt(transaction.getAmount(), i, 3);
            model.setValueAt(transaction.getReceiver().getName(), i, 4);
            model.setValueAt(transaction.getType(), i, 5);
        }
    }
    
    public void loadManagerClientInfoData() {
        JTable table = managerClientInfo.getDataTable();
        TableModel model = table.getModel();
        try {
            dbManager.loadClientDB();
            ArrayList<Client> clientDB = dbManager.getClientDB();
            for (int i = 0; i < clientDB.size(); i++) {
                Client client = clientDB.get(i);
                model.setValueAt(i + 1, i, 0);
                model.setValueAt(client.getAccountNo(), i, 1);
                model.setValueAt(client.getName(), i, 2);
                model.setValueAt(client.getPhone(), i, 3);
                model.setValueAt(client.getNationalID(), i, 4);
                model.setValueAt(client.getUsername(), i, 5);
                model.setValueAt(client.getBalance(), i, 6);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void updateCurrentBalance() {
        String currentBalance = Double.toString(userClient.getBalance());
        clientFundTransfer.getCurrentBalance().setText(currentBalance);
        clientMobileRecharge.getCurrentBalance().setText(currentBalance);
        clientUtilityBill.getCurrentBalance().setText(currentBalance);
        clientStatement.getCurrentBalance().setText(currentBalance);
        clientWithdrawCash.getCurrentBalance().setText(currentBalance);
    }

    public static class UserNotFoundException extends Exception {

        public UserNotFoundException() {
        }
    }

}
