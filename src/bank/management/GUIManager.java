package bank.management;

import bank.management.gui.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.TableModel;

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

    public GUIManager() throws InterruptedException, IOException, FileNotFoundException, ClassNotFoundException {
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
        LoginInfo loginInfo = dbManager.getLoginInfo();
        if (loginInfo == null) {
            navigator.navigate(loginScreen);
            splash.dispose();
            return;
        }
        Date prev = loginInfo.getDate();
        Date now = new Date();
        long timeDiff = now.getTime() - prev.getTime();
        if (timeDiff > GUIManager.LOGIN_CACHE_TIME) {
            navigator.navigate(loginScreen);
            splash.dispose();
            return;
        }
        String username = loginInfo.getUsername();
        String password = loginInfo.getPassword();

        

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
    }
    
    public void updateLoginInfo() throws IOException, FileNotFoundException, UnsupportedEncodingException, ClassNotFoundException {
        updateLoginInfo("admin", "admin");
    }

    public void updateLoginInfo(String username, String password) throws IOException, FileNotFoundException, UnsupportedEncodingException, ClassNotFoundException {
        dbManager.setLoginInfo(new LoginInfo(username, password));
    }
    
    public void loginUser(String username, String password) throws IOException, FileNotFoundException, ClassNotFoundException, UserNotFoundException {
        
        boolean notFound = true;
        for (Client client : dbManager.getClientDB()) {
            if (client.getUsername().equals(username)) {
                userClient = client;
                notFound = false;
            }
        }
        if (notFound) throw new UserNotFoundException();
        navigator.navigate(clientProfile);
        updateLoginInfo(username, password);
    }
    
    public void loadComplains() {
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
        ArrayList<Transaction> transactionDB = dbManager.getTransactionDB();
        for (int i = 0; i < transactionDB.size(); i++) {
            Transaction transaction = transactionDB.get(i);
            model.setValueAt(i + 1, i, 0);
            model.setValueAt(transaction.getSender().getName(), i, 1);
            model.setValueAt(transaction.getDate(), i, 2);
            model.setValueAt(transaction.getAmount(), i, 3);
            model.setValueAt(transaction.getReceiver() == null? "-" : transaction.getReceiver().getName(), i, 4);
            model.setValueAt(transaction.getType(), i, 5);
        }
    }
    
    public void loadClientTransactions() {
        JTable table = clientStatement.getClientTransactionsTable();
        TableModel model = table.getModel();
        ArrayList<Transaction> transactions = userClient.getTransactionList();
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            model.setValueAt(i + 1, i, 0);
            model.setValueAt(transaction.getDate(), i, 1);
            model.setValueAt(transaction.getAmount(), i, 2);
            model.setValueAt(transaction.getReceiver() == null? "-" : transaction.getReceiver().getName(), i, 3);
            model.setValueAt(transaction.getType(), i, 4);
        }
    }
    
    public void loadManagerClientInfoData() {
        JTable table = managerClientInfo.getDataTable();
        TableModel model = table.getModel();

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
    }

    public static class UserNotFoundException extends Exception {
        public UserNotFoundException() {}
    }

}
