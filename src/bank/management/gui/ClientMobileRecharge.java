
package bank.management.gui;

import bank.management.Client;
import bank.management.DBManager;
import bank.management.GUIManager;
import bank.management.Organization;
import bank.management.transaction.MoblieRechargeHandler;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ClientMobileRecharge extends JFrameBase {
    
    public JButton getBackButton() {
        return backButton;
    }

    public JTextField getAmount() {
        return amount;
    }

    public JTextField getCurrentBalance() {
        return currentBalance;
    }

    public JButton getMobileRechargeButton() {
        return mobileRechargeButton;
    }

    public JComboBox<String> getOperator() {
        return operator;
    }

    public JTextField getPhoneNumber() {
        return phoneNumber;
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

    public JButton getFundTransferButton() {
        return fundTransferButton;
    }

    public JLabel getClientName() {
        return clientName;
    }
    
    public JButton getComplainBoxButton() {
        return complainBoxButton;
    }
    public JButton getStatementButton() {
        return statementButton;
    }
    public JButton getPayBillButton() {
        return  payBillButton;
    }

    public JButton getWithdrawFundButton() {
        return withdrawFundButton;
    }

    /**
     * Creates new form Client_Mobile_Recharge
     * @param guiManager
     */
    public ClientMobileRecharge(GUIManager guiManager) {
        super(guiManager);
        initComponents();
        placeOnCenter();
        //jButton1.setBorder(BorderFactory.createEmptyBorder());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JFrameBase.GradientBackgroundPanel("352D4B", "836AAE", JFrameBase.GradientBackgroundPanel.Direction.TOP_TO_BOTTOM);
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        fundTransferButton = new javax.swing.JButton();
        payBillButton = new javax.swing.JButton();
        statementButton = new javax.swing.JButton();
        complainBoxButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        withdrawFundButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        operator = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        currentBalance = new javax.swing.JTextField();
        mobileRechargeButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        clientName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(234, 84, 85));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));

        closeButton.setBackground(new java.awt.Color(234, 84, 85));
        closeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("X");
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);

        minimizeButton.setBackground(new java.awt.Color(234, 84, 85));
        minimizeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        minimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        minimizeButton.setText("-");
        minimizeButton.setBorder(null);
        minimizeButton.setBorderPainted(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("East West University Bank Limited");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        backButton.setBackground(new java.awt.Color(191, 164, 219));
        backButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(53, 45, 75));
        backButton.setText("Back");

        fundTransferButton.setBackground(new java.awt.Color(191, 164, 219));
        fundTransferButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        fundTransferButton.setForeground(new java.awt.Color(53, 45, 75));
        fundTransferButton.setText("Fund Transfer");

        payBillButton.setBackground(new java.awt.Color(191, 164, 219));
        payBillButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        payBillButton.setForeground(new java.awt.Color(53, 45, 75));
        payBillButton.setText("Pay Bill");
        payBillButton.setActionCommand("Withdraw");

        statementButton.setBackground(new java.awt.Color(191, 164, 219));
        statementButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        statementButton.setForeground(new java.awt.Color(53, 45, 75));
        statementButton.setText("Statement");
        statementButton.setActionCommand("Withdraw");

        complainBoxButton.setBackground(new java.awt.Color(191, 164, 219));
        complainBoxButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        complainBoxButton.setForeground(new java.awt.Color(53, 45, 75));
        complainBoxButton.setText("Complain Box");
        complainBoxButton.setActionCommand("Withdraw");

        logoutButton.setBackground(new java.awt.Color(191, 164, 219));
        logoutButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(53, 45, 75));
        logoutButton.setText("Log Out");
        logoutButton.setActionCommand("Withdraw");

        withdrawFundButton.setBackground(new java.awt.Color(191, 164, 219));
        withdrawFundButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        withdrawFundButton.setForeground(new java.awt.Color(53, 45, 75));
        withdrawFundButton.setText("Withdraw Fund");
        withdrawFundButton.setActionCommand("Withdraw");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Number:");

        operator.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        operator.setForeground(new java.awt.Color(45, 64, 89));
        operator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Robi", "Airtel", "BanglaLink", "GrameenPhone", "Teletalk" }));
        operator.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Operator:");

        phoneNumber.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/recharge.gif"))); // NOI18N

        amount.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Amount:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Current Balance:");

        currentBalance.setEditable(false);
        currentBalance.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        mobileRechargeButton.setBackground(new java.awt.Color(191, 164, 219));
        mobileRechargeButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        mobileRechargeButton.setForeground(new java.awt.Color(53, 45, 75));
        mobileRechargeButton.setText("Recharge");
        mobileRechargeButton.setActionCommand("Withdraw");
        mobileRechargeButton.setEnabled(false);

        jLabel12.setBackground(new java.awt.Color(255, 212, 96));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Client name");

        jLabel16.setBackground(new java.awt.Color(255, 212, 96));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Mobile Recharge Menu");

        clientName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        clientName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(210, 210, 210)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(minimizeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closeButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mobileRechargeButton)
                                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(statementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(payBillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(withdrawFundButton, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                            .addComponent(fundTransferButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(complainBoxButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(phoneNumber)
                                            .addComponent(operator, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(closeButton)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fundTransferButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(withdrawFundButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payBillButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statementButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(complainBoxButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(operator, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mobileRechargeButton)))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel clientName;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton complainBoxButton;
    private javax.swing.JTextField currentBalance;
    private javax.swing.JButton fundTransferButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JButton mobileRechargeButton;
    private javax.swing.JComboBox<String> operator;
    private javax.swing.JButton payBillButton;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton statementButton;
    private javax.swing.JButton withdrawFundButton;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void setAllListeners() {
        ClientFundTransfer clientFundTransfer = guiManager.getClientFundTransfer();
        ClientComplainPage clientComplainPage = guiManager.getClientComplainPage();
        ClientStatement clientStatement = guiManager.getClientStatement();
        ClientUtilityBill clientUtilityBill = guiManager.getClientUtilityBill();
        ClientWithdrawCash clientWithdrawCash = guiManager.getClientWithdrawCash();
        
        navigateOnButtonAction(fundTransferButton, clientFundTransfer);
        navigateOnButtonAction(complainBoxButton, clientComplainPage);
        navigateOnButtonAction(statementButton, clientStatement);
        navigateOnButtonAction(payBillButton, clientUtilityBill);
        navigateOnButtonAction(withdrawFundButton, clientWithdrawCash);
        
        ActionListener enterPressListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mobileRechargeButton.doClick();
            }

        };

        mobileRechargeButton.addActionListener((ActionEvent e) -> {
            DBManager dbManager = guiManager.getDBManager();
            
            String operatorName = (String) operator.getSelectedItem();
            String amountValue = amount.getText();
            MoblieRechargeHandler mrh = new MoblieRechargeHandler(dbManager, guiManager.getUserClient(), new Organization(operatorName));
            try {
                mrh.makeTransaction(Double.parseDouble(amountValue));
                JOptionPane.showMessageDialog(this, "Mobile recharge successfull!");
                clearAllFields();
                loadVisibleData();
            } catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(ClientMobileRecharge.this, "Invalid amount!");
            } catch (Client.InsufficientBalanceException ex) {
                JOptionPane.showMessageDialog(ClientMobileRecharge.this, "Insufficient Balance!");
            }
        });
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                loadVisibleData();
            }
        });
        
        DocumentListener documentListener = new DocumentListener(){
            
            @Override
            public void insertUpdate(DocumentEvent e) {
                toggleMobileRechargeButton();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                toggleMobileRechargeButton();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //
            }

            
        };
        
        phoneNumber.getDocument().addDocumentListener(documentListener);
        phoneNumber.addActionListener(enterPressListener);
        amount.getDocument().addDocumentListener(documentListener);
        amount.addActionListener(enterPressListener);
        
        fundTransferButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        complainBoxButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        statementButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        payBillButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mobileRechargeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        withdrawFundButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        minimizeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logoutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      
        
                
        addColorChangeOnHover(fundTransferButton);
        addColorChangeOnHover(complainBoxButton);
        addColorChangeOnHover(statementButton);
        addColorChangeOnHover(payBillButton);
        addColorChangeOnHover(mobileRechargeButton);
        addColorChangeOnHover(withdrawFundButton);
        addColorChangeOnHover(backButton);
        addColorChangeOnHover(logoutButton);
        addColorChangeOnHover(mobileRechargeButton);
        
        
                minimizeButton.setOpaque(false);
        closeButton.setOpaque(false);
        setBackButtonAction(backButton);
        setMinimizeButtonAction(minimizeButton);
        setLogoutButtonAction(logoutButton);
        setCloseButtonAction(closeButton);
        
    }
    
    private void toggleMobileRechargeButton() {
        String[] data = new String[2];
        data[0] = amount.getText();
        data[1] = phoneNumber.getText();
        toggleButtonEnable(data, mobileRechargeButton);     
    }
    
    private void clearAllFields() {
        phoneNumber.setText("");
        amount.setText("");
    }

    @Override
    public void loadVisibleData() {
        Client userClient = guiManager.getUserClient();
        clientName.setText(userClient.getName());
        currentBalance.setText(Double.toString(userClient.getBalance()));
    }
}
