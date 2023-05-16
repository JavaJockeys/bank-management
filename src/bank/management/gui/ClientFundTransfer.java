
package bank.management.gui;

import bank.management.Client;
import bank.management.DBManager;
import bank.management.GUIManager;
import bank.management.transaction.FundTransferHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ClientFundTransfer extends JFrameBase {

    public JButton getBackButton() {
        return backButton;
    }

    public JTextField getCurrentBalance() {
        return currentBalance;
    }

    public JTextField getAccountNoField() {
        return accountNo;
    }

    public JTextField getAmountField() {
        return amount;
    }

    public JButton getSendButton() {
        return sendButton;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JButton getCloseButton() {
        return closeButton;
    }

    public JButton getMinimizeButton() {
        return minimizeButton;
    }


    public JButton getComplainBoxButton() {
        return complainBoxButton;
    }

    public JButton getStatementButton() {
        return statementButton;
    }

    public JButton getPayBillButton() {
        return payBillButton;
    }

    public JButton getMobileRechargeButton() {
        return mobileRechargeButton;
    }

    public JButton getWithdrawFundButton() {
        return withdrawFundButton;
    }

    /**
     * Creates new form Client_Fund_Transfer
     *
     * @param guiManager
     */
    public ClientFundTransfer(GUIManager guiManager) {
        super(guiManager);
        initComponents();
        placeOnCenter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        accountNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        currentBalance = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        clientName = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        mobileRechargeButton = new javax.swing.JButton();
        payBillButton = new javax.swing.JButton();
        statementButton = new javax.swing.JButton();
        complainBoxButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        withdrawFundButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(234, 84, 85));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));

        jPanel2.setBackground(new java.awt.Color(247, 209, 209));

        jPanel3.setBackground(new java.awt.Color(234, 84, 85));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 212, 96));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Account no:");

        jComboBox1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(45, 64, 89));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bank to Bank", "Bkash", "Nogod" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 212, 96));
        jLabel6.setText("Transfer Type:");

        accountNo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/transfer.gif"))); // NOI18N

        amount.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 212, 96));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Amount:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 212, 96));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Current Balance:");

        currentBalance.setEditable(false);
        currentBalance.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        sendButton.setBackground(new java.awt.Color(255, 212, 96));
        sendButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        sendButton.setForeground(new java.awt.Color(234, 84, 85));
        sendButton.setText("Send");
        sendButton.setActionCommand("Withdraw");
        sendButton.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(sendButton)
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jLabel12.setBackground(new java.awt.Color(255, 212, 96));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(45, 64, 89));
        jLabel12.setText("Client name");

        jLabel16.setBackground(new java.awt.Color(255, 212, 96));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(45, 64, 89));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Fund Transfer Menu");

        clientName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        clientName.setForeground(new java.awt.Color(45, 64, 89));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        closeButton.setBackground(new java.awt.Color(234, 84, 85));
        closeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        closeButton.setText("X");
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);

        minimizeButton.setBackground(new java.awt.Color(234, 84, 85));
        minimizeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        minimizeButton.setText("_");
        minimizeButton.setBorder(null);
        minimizeButton.setBorderPainted(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 212, 96));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("East West University Bank Limited");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        backButton.setBackground(new java.awt.Color(255, 212, 96));
        backButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(234, 84, 85));
        backButton.setText("Back");

        mobileRechargeButton.setBackground(new java.awt.Color(255, 212, 96));
        mobileRechargeButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        mobileRechargeButton.setForeground(new java.awt.Color(234, 84, 85));
        mobileRechargeButton.setText("Mobile Recharge");
        mobileRechargeButton.setActionCommand("Withdraw");

        payBillButton.setBackground(new java.awt.Color(255, 212, 96));
        payBillButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        payBillButton.setForeground(new java.awt.Color(234, 84, 85));
        payBillButton.setText("Pay Bill");
        payBillButton.setActionCommand("Withdraw");

        statementButton.setBackground(new java.awt.Color(255, 212, 96));
        statementButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        statementButton.setForeground(new java.awt.Color(234, 84, 85));
        statementButton.setText("Statement");
        statementButton.setActionCommand("Withdraw");

        complainBoxButton.setBackground(new java.awt.Color(255, 212, 96));
        complainBoxButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        complainBoxButton.setForeground(new java.awt.Color(234, 84, 85));
        complainBoxButton.setText("Complain Box");
        complainBoxButton.setActionCommand("Withdraw");

        logoutButton.setBackground(new java.awt.Color(255, 212, 96));
        logoutButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(234, 84, 85));
        logoutButton.setText("Log Out");
        logoutButton.setActionCommand("Withdraw");

        withdrawFundButton.setBackground(new java.awt.Color(255, 212, 96));
        withdrawFundButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        withdrawFundButton.setForeground(new java.awt.Color(234, 84, 85));
        withdrawFundButton.setText("Withdraw Fund");
        withdrawFundButton.setActionCommand("Withdraw");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(minimizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mobileRechargeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(payBillButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statementButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(complainBoxButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(withdrawFundButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeButton)
                            .addComponent(jLabel3)))
                    .addComponent(minimizeButton))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(withdrawFundButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mobileRechargeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payBillButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statementButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(complainBoxButton)
                        .addGap(362, 362, 362)
                        .addComponent(logoutButton)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNo;
    private javax.swing.JTextField amount;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel clientName;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton complainBoxButton;
    private javax.swing.JTextField currentBalance;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JButton mobileRechargeButton;
    private javax.swing.JButton payBillButton;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton statementButton;
    private javax.swing.JButton withdrawFundButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setAllListeners() {
        ClientComplainPage clientComplainPage = guiManager.getClientComplainPage();
        ClientMobileRecharge clientMobileRecharge = guiManager.getClientMobileRecharge();
        ClientStatement clientStatement = guiManager.getClientStatement();
        ClientUtilityBill clientUtilityBill = guiManager.getClientUtilityBill();
        ClientWithdrawCash clientWithdrawCash = guiManager.getClientWithdrawCash();
        
        navigateOnButtonAction(complainBoxButton, clientComplainPage);
        navigateOnButtonAction(mobileRechargeButton, clientMobileRecharge);
        navigateOnButtonAction(statementButton, clientStatement);
        navigateOnButtonAction(payBillButton, clientUtilityBill);
        navigateOnButtonAction(withdrawFundButton, clientWithdrawCash);
        
        
        sendButton.addActionListener((ActionEvent e) -> {
            DBManager dbManager = guiManager.getDBManager();
            
            String accountNoValue = accountNo.getText();
            String amountValue = amount.getText();
            for (Client client : dbManager.getClientDB()) {
                if (client.getAccountNo().equals(accountNoValue)) {
                    FundTransferHandler fth = new FundTransferHandler(dbManager, guiManager.getUserClient(), client);
                    try {
                        fth.makeTransaction(Double.parseDouble(amountValue));
                    } catch(NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(ClientFundTransfer.this, "Invalid amount!");
                    } catch (Client.InsufficientBalanceException ex) {
                        JOptionPane.showMessageDialog(ClientFundTransfer.this, "Insufficient Balance!");
                    }
                    JOptionPane.showMessageDialog(this, "Fund transfer successful!");
                    clearAllFields();
                    loadVisibleData();
                    return;
                }
            }
            JOptionPane.showMessageDialog(ClientFundTransfer.this, "No account found!");
        });
        
        ActionListener enterPressListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendButton.doClick();
            }

        };
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                loadVisibleData();
            }
        });
        
        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                toggleSendButton();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                toggleSendButton();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        };
        
        amount.getDocument().addDocumentListener(documentListener);
        amount.addActionListener(enterPressListener);
        accountNo.getDocument().addDocumentListener(documentListener);
        accountNo.addActionListener(enterPressListener);

        setBackButtonAction(backButton);
        setMinimizeButtonAction(minimizeButton);
        setLogoutButtonAction(logoutButton);
        setCloseButtonAction(closeButton);
    }
    
    private void toggleSendButton() {
        String data[] = new String[2];
        data[0] = amount.getText();
        data[1] = accountNo.getText();
        toggleButtonEnable(data, sendButton);
    }

    @Override
    public void loadVisibleData() {
        Client userClient = guiManager.getUserClient();
        clientName.setText(userClient.getName());
        currentBalance.setText(Double.toString(userClient.getBalance()));
    }
    
    private void clearAllFields() {
        amount.setText("");
        accountNo.setText("");
    }
}
