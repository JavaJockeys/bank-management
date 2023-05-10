package bank.management;


import bank.management.gui.*;
import java.awt.Frame;
import java.awt.HeadlessException;
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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Osama
 */
public class GUIManager {
    public static final long LOGIN_CACHE_TIME = 30*60*1000;
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
    
    private final DBManager dbManager;
    
    public GUIManager() {
        this.navigator = new Navigator();
        this.dbManager = new DBManager();
        
        this.splash = new Splash(navigator);
        this.loginScreen = new LoginScreen(navigator);
        this.clientComplainPage = new ClientComplainPage(navigator);
        this.clientFundTransfer = new ClientFundTransfer(navigator);
        this.clientMobileRecharge = new ClientMobileRecharge(navigator);
        this.clientProfile = new ClientProfile(navigator);
        this.clientStatement = new ClientStatement(navigator);
        this.clientUtilityBill = new ClientUtilityBill(navigator);
        this.clientWithdrawCash = new ClientWithdrawCash(navigator);
        this.complains = new Complains(navigator);
        this.managerClientInfo = new ManagerClientInfo(navigator);
        this.managerDashboard = new ManagerDashboard(navigator);
        this.managerHomepage = new ManagerHomepage(navigator);
        setSplashListeners();
        setLoginScreenListeners();
        setManagerHomepageListeners();
        setManagerDashboardListeners();
        setManagerClientInfoListeners();
        setComplainsListeners();
        
        // loadManagerDashboardData();
        loadManagerClientInfoData();
        //loadComplainsData();

        navigator.navigate(splash);
    }


    private void setBackButtonAction(JFrameBase frame, JButton backButton) {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.back();
            }
            
        });
    }
    
    private void setCloseButtonAction(JButton closeButton) {
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    private void setMinimizeButtonAction(JFrameBase frame, JButton minimizeButton) {
        minimizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setExtendedState(Frame.ICONIFIED);
            }
            
        });
    }
    
    private void setLogoutButtonAction(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginScreen.dispose();
                navigator.navigate(loginScreen);
            }
        });
    }
    
    private void setSplashListeners() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                JProgressBar pb = splash.getjProgressBar1();
                Random random = new Random();
                int progress = 0;
                while (progress < 100) {
                    try {
                        Thread.sleep(130);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                    progress += random.nextInt(10)+5;
                    pb.setValue(progress);
                }
                pb.setValue(100);
                
                try {
                    dbManager.loadLoginInfo();
                    LoginInfo loginInfo = dbManager.getLoginInfo();
                    Date prev = loginInfo.getDate();
                    Date now = new Date();
                    long timeDiff = now.getTime() - prev.getTime();
                    System.out.println(prev.getTime());
                    if (timeDiff <= GUIManager.LOGIN_CACHE_TIME) {
                        String username = loginInfo.getUsername();
                        String password = loginInfo.getPassword();
                        
                        if (username.equals("admin") && password.equals("admin")) {
                            updateLoginInfo();
                            navigator.navigate(managerHomepage);
                            splash.dispose();
                            return;
                        }
                        
                        dbManager.loadCredentialDB();
                        HashMap<String, String> mp = dbManager.getCredentialDB();
                        if (mp.get(username).equals(password)) {
                            navigator.navigate(clientProfile);
                            splash.dispose();
                            return;
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(GUIManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                  
                  Logger.getLogger(GUIManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NullPointerException nex) {
                    // nothing
                    System.out.println("Null pointer exx");
                }
                
                navigator.navigate(loginScreen);
                splash.dispose();
            }
        });
        splash.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                t.start();
            }
        });
    }
    
    private void toggleButtonEnable(String[] values, JButton button) {
        for (String value : values) {
            if (value.isEmpty()) {
                button.setEnabled(false);
                return;
            }
        }
        button.setEnabled(true);
    }

    private void updateLoginInfo() throws IOException, FileNotFoundException, UnsupportedEncodingException, ClassNotFoundException {
        updateLoginInfo("admin", "admin");
    }
    
    private void updateLoginInfo(String username, String password) throws IOException, FileNotFoundException, UnsupportedEncodingException, ClassNotFoundException {
        dbManager.setLoginInfo(new LoginInfo(username, password));
        dbManager.updateLoginInfo();
    }
    
    private void toggleLoginButton() {
        String[] data = new String[2];
        data[0] = loginScreen.getUsername().getText();
        data[1] = new String(loginScreen.getPassword().getPassword());
        toggleButtonEnable(data, loginScreen.getLoginButton());
    }
    private void setLoginScreenListeners() {
        JButton loginButton = loginScreen.getLoginButton();
        JTextField username = loginScreen.getUsername();
        JPasswordField password = loginScreen.getPassword();
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dbManager.loadCredentialDB();
                    
                    HashMap<String, String> mp = dbManager.getCredentialDB();
                    String username = loginScreen.getUsername().getText();
                    char[] password = loginScreen.getPassword().getPassword();
                    char[] adminPass = {'a', 'd', 'm', 'i', 'n'};
                    
                    if (username.equals("admin") && Arrays.equals(password, adminPass)) {
                        updateLoginInfo();
                        navigator.navigate(managerHomepage);
                        return;
                    }
                    
                    if (username.equals("admin") && !Arrays.equals(password, adminPass)) {
                        JOptionPane.showMessageDialog(loginScreen, "Wrong Password!", "Invalid password", 0);
                        return;
                    }
                    
                    if (!mp.containsKey(username)) {
                        JOptionPane.showMessageDialog(loginScreen, "username not found!", "Invalid username", 0);
                        return;
                    }
                    
                    if (!Arrays.equals(mp.get(username).toCharArray(), password)) {
                        JOptionPane.showMessageDialog(loginScreen, "Wrong Password!.", "Invalid password!", 0);
                        return;
                    }
                    
                    updateLoginInfo(username, password.toString());
                    navigator.navigate(clientProfile);
                } catch (IOException ex) {
                    System.out.println(ex);
                } catch (ClassNotFoundException ex) {
                    System.out.println(ex);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }   
        });

        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                toggleLoginButton();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e) {
                toggleLoginButton();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
            
        };
        
        ActionListener enterPressListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginButton.doClick();
            }
            
        }; 
        
        username.getDocument().addDocumentListener(documentListener);
        username.addActionListener(enterPressListener);
        password.getDocument().addDocumentListener(documentListener);
        password.addActionListener(enterPressListener);
        
        setMinimizeButtonAction(loginScreen, loginScreen.getMinimizeButton());
        setCloseButtonAction(loginScreen.getCloseButton());
    }
    
    private void navigateOnButtonAction(JButton button, JFrameBase navigateTo) {
        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                navigator.navigate(navigateTo);
            }
            
        });
    }
    
    private void navigateOnMouseAction(JComponent component, JFrameBase navigateTo) {
        component.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                navigator.navigate(navigateTo);
            }
        });
    }
    
    void setManagerHomepageListeners() {
        JButton clientInfoMenu = managerHomepage.getClientInfoMenu();
        JButton dashboardMenu = managerHomepage.getDashboardMenu();
        JButton complainMenu = managerHomepage.getComplainMenu();
        JPanel clientInfoPanel = managerHomepage.getClientInfoPanel();
        JPanel dashboardPanel = managerHomepage.getDashboardPanel();
        JPanel complainPanel = managerHomepage.getComplainPanel();
        
        navigateOnButtonAction(clientInfoMenu, managerClientInfo);
        navigateOnButtonAction(dashboardMenu, managerDashboard);
        navigateOnButtonAction(complainMenu, complains);
        
        navigateOnMouseAction(clientInfoPanel, managerClientInfo);
        navigateOnMouseAction(dashboardPanel, managerDashboard);
        navigateOnMouseAction(complainPanel, complains);
        
        setBackButtonAction(managerHomepage, managerHomepage.getBackButton());
        setMinimizeButtonAction(managerHomepage, managerHomepage.getMinimizeButton());
        setLogoutButtonAction(managerHomepage.getLogoutButton());
        setCloseButtonAction(managerHomepage.getCloseButton());
    }
    
    private void setManagerDashboardListeners() {
        JButton clientInfoMenu = managerDashboard.getClientInfoMenu();
        JButton homepageMenu = managerDashboard.getHomepageMenu();
        JButton complainMenu = managerDashboard.getComplainsMenu();
        
        navigateOnButtonAction(clientInfoMenu, managerClientInfo);
        navigateOnButtonAction(homepageMenu, managerHomepage);
        navigateOnButtonAction(complainMenu, complains);
        setBackButtonAction(managerDashboard, managerDashboard.getBackButton());
        setMinimizeButtonAction(managerDashboard, managerDashboard.getMinimizeButton());
        setLogoutButtonAction(managerDashboard.getLogoutButton());
        setCloseButtonAction(managerDashboard.getCloseButton());
        
    }

    private void toggleRegisterButton() {
        String[] data = new String[7];
        data[0] = managerClientInfo.getClientName().getText();
        data[1] = managerClientInfo.getAddress().getText();
        data[2] = managerClientInfo.getNationalID().getText();
        data[3] = managerClientInfo.getPhone().getText();
        data[4] = managerClientInfo.getUsername().getText();
        data[5] = managerClientInfo.getPassword().getText();
        data[6] = managerClientInfo.getBalance().getText();
        toggleButtonEnable(data, managerClientInfo.getRegisterClientButton());
    }
    
    private void registerNewClient(JButton button) {
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField name = managerClientInfo.getClientName();
                JTextField address = managerClientInfo.getAddress();
                JTextField nationalID = managerClientInfo.getNationalID();
                JTextField phone = managerClientInfo.getPhone();
                JTextField username = managerClientInfo.getUsername();
                JTextField password = managerClientInfo.getPassword();
                JTextField balance = managerClientInfo.getBalance();
                
                HashMap<String, String> credentialDB = dbManager.getCredentialDB();
                if (credentialDB.containsKey(username)) {
                    JOptionPane.showMessageDialog(managerClientInfo, "Username already exists!", "Error", 0);
                    return;
                }
                ArrayList<Client> clientDB = dbManager.getClientDB();
                String accountNo = "EWUBL0000" + (1000 + clientDB.size());
                Client newClient = new Client(
                        name.getText(),
                        phone.getText(),
                        accountNo,
                        address.getText(),
                        nationalID.getText(),
                        username.getText(),
                        password.getText(),
                        Double.parseDouble(balance.getText())
                );
                clientDB.add(newClient);
                credentialDB.put(username.getText(), password.getText());
                try {
                    dbManager.updateClientDB();
                    name.setText("");
                    address.setText("");
                    phone.setText("");
                    nationalID.setText("");
                    username.setText("");
                    password.setText("");
                    balance.setText("");
                    dbManager.updateCredentialDB();
                    loadManagerClientInfoData();
                } catch (UnsupportedEncodingException e1) {
                    e1.printStackTrace();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }


    private void setManagerClientInfoListeners() {
        JButton dashboardMenu = managerClientInfo.getDashboardMenu();
        JButton homepageMenu = managerClientInfo.getHomepageMenu();
        JButton complainMenu = managerClientInfo.getComplainsMenu();
        JButton registerClientButton = managerClientInfo.getRegisterClientButton();

        JTextField name = managerClientInfo.getClientName();
        JTextField address = managerClientInfo.getAddress();
        JTextField nationalID = managerClientInfo.getNationalID();
        JTextField phone = managerClientInfo.getPhone();
        JTextField username = managerClientInfo.getUsername();
        JTextField password = managerClientInfo.getPassword();
        JTextField balance = managerClientInfo.getBalance();
        
        registerNewClient(registerClientButton);
        
        ActionListener enterPressListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerClientButton.doClick();
            }
            
        };
        DocumentListener documentListener = new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                toggleRegisterButton();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                toggleRegisterButton();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
            
        };

        name.getDocument().addDocumentListener(documentListener);
        name.addActionListener(enterPressListener);
        nationalID.getDocument().addDocumentListener(documentListener);
        nationalID.addActionListener(enterPressListener);
        username.getDocument().addDocumentListener(documentListener);
        username.addActionListener(enterPressListener);
        password.getDocument().addDocumentListener(documentListener);
        password.addActionListener(enterPressListener);
        phone.getDocument().addDocumentListener(documentListener);
        phone.addActionListener(enterPressListener);
        balance.getDocument().addDocumentListener(documentListener);
        balance.addActionListener(enterPressListener);
        address.getDocument().addDocumentListener(documentListener);
        address.addActionListener(enterPressListener);

        navigateOnButtonAction(dashboardMenu, managerDashboard);
        navigateOnButtonAction(homepageMenu, managerHomepage);
        navigateOnButtonAction(complainMenu, complains);
        setBackButtonAction(managerClientInfo, managerClientInfo.getBackButton());
        setMinimizeButtonAction(managerClientInfo, managerClientInfo.getMinimizeButton());
        setLogoutButtonAction(managerClientInfo.getLogoutButton());
        setCloseButtonAction(managerClientInfo.getCloseButton());
    }
    
    private void setComplainsListeners() {
        JButton dashboardMenu = complains.getDashboardMenu();
        JButton homepageMenu = complains.getHomepageMenu();
        JButton clientInfoMenu = complains.getClientInfoMenu();
        
        navigateOnButtonAction(dashboardMenu, managerDashboard);
        navigateOnButtonAction(homepageMenu, managerHomepage);
        navigateOnButtonAction(clientInfoMenu, managerClientInfo);
        setBackButtonAction(complains, complains.getBackButton());
        setMinimizeButtonAction(complains, complains.getMinimizeButton());
        setLogoutButtonAction(complains.getLogoutButton());
        setCloseButtonAction(complains.getCloseButton());
    }
    
    
    
    
    
    private void loadManagerClientInfoData() {
        JTable table = managerClientInfo.getDataTable();
        TableModel model = table.getModel();
        try {
            dbManager.loadClientDB();
            ArrayList<Client> clientDB = dbManager.getClientDB();
            for (int i = 0; i < clientDB.size(); i++) {
                Client client = clientDB.get(i);
                model.setValueAt(i+1, i, 0);
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
    
}
