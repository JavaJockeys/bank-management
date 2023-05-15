/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bank.management.gui;

import bank.management.GUIManager;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 *
 * @author Osama
 */
public class ClientProfile extends JFrameBase {

    /**
     * Creates new form ClientProfileCopy
     */
    public ClientProfile(GUIManager guiManager) {
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
        fundTransferPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        withdrawFundPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        mobileRechargePanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        payBillPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        statementPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        complainBoxPanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        clientName = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        fundTransferButton = new javax.swing.JButton();
        withdrawFundButton = new javax.swing.JButton();
        mobileRechargeButton = new javax.swing.JButton();
        payBillButton = new javax.swing.JButton();
        statementButton = new javax.swing.JButton();
        complainBoxButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 760));

        jPanel1.setBackground(new java.awt.Color(234, 84, 85));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 760));

        jPanel2.setBackground(new java.awt.Color(247, 209, 209));
        jPanel2.setPreferredSize(new java.awt.Dimension(773, 660));

        fundTransferPanel.setBackground(new java.awt.Color(234, 84, 85));
        fundTransferPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/transfer.gif"))); // NOI18N

        jButton11.setBackground(new java.awt.Color(255, 212, 96));
        jButton11.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(234, 84, 85));
        jButton11.setText("Fund Transfer");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundTransferPanelLayout = new javax.swing.GroupLayout(fundTransferPanel);
        fundTransferPanel.setLayout(fundTransferPanelLayout);
        fundTransferPanelLayout.setHorizontalGroup(
            fundTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundTransferPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fundTransferPanelLayout.setVerticalGroup(
            fundTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundTransferPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        withdrawFundPanel.setBackground(new java.awt.Color(234, 84, 85));
        withdrawFundPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/withdraw.gif"))); // NOI18N

        jButton16.setBackground(new java.awt.Color(255, 212, 96));
        jButton16.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(234, 84, 85));
        jButton16.setText("Withdraw Fund");
        jButton16.setActionCommand("Withdraw");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout withdrawFundPanelLayout = new javax.swing.GroupLayout(withdrawFundPanel);
        withdrawFundPanel.setLayout(withdrawFundPanelLayout);
        withdrawFundPanelLayout.setHorizontalGroup(
            withdrawFundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawFundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        withdrawFundPanelLayout.setVerticalGroup(
            withdrawFundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawFundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jButton16)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        mobileRechargePanel.setBackground(new java.awt.Color(234, 84, 85));
        mobileRechargePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/recharge.gif"))); // NOI18N

        jButton12.setBackground(new java.awt.Color(255, 212, 96));
        jButton12.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(234, 84, 85));
        jButton12.setText("Mobile Recharge");
        jButton12.setActionCommand("Withdraw");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mobileRechargePanelLayout = new javax.swing.GroupLayout(mobileRechargePanel);
        mobileRechargePanel.setLayout(mobileRechargePanelLayout);
        mobileRechargePanelLayout.setHorizontalGroup(
            mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mobileRechargePanelLayout.setVerticalGroup(
            mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addGap(19, 19, 19))
        );

        payBillPanel.setBackground(new java.awt.Color(234, 84, 85));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/bill.gif"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton13.setBackground(new java.awt.Color(255, 212, 96));
        jButton13.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(234, 84, 85));
        jButton13.setText("Pay Bill");
        jButton13.setActionCommand("Withdraw");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout payBillPanelLayout = new javax.swing.GroupLayout(payBillPanel);
        payBillPanel.setLayout(payBillPanelLayout);
        payBillPanelLayout.setHorizontalGroup(
            payBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payBillPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        payBillPanelLayout.setVerticalGroup(
            payBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payBillPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statementPanel.setBackground(new java.awt.Color(234, 84, 85));
        statementPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/statement.gif"))); // NOI18N

        jButton14.setBackground(new java.awt.Color(255, 212, 96));
        jButton14.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(234, 84, 85));
        jButton14.setText("Statement");
        jButton14.setActionCommand("Withdraw");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statementPanelLayout = new javax.swing.GroupLayout(statementPanel);
        statementPanel.setLayout(statementPanelLayout);
        statementPanelLayout.setHorizontalGroup(
            statementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statementPanelLayout.setVerticalGroup(
            statementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        complainBoxPanel.setBackground(new java.awt.Color(234, 84, 85));
        complainBoxPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/report.gif"))); // NOI18N

        jButton15.setBackground(new java.awt.Color(255, 212, 96));
        jButton15.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(234, 84, 85));
        jButton15.setText("Complain Box");
        jButton15.setActionCommand("Withdraw");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout complainBoxPanelLayout = new javax.swing.GroupLayout(complainBoxPanel);
        complainBoxPanel.setLayout(complainBoxPanelLayout);
        complainBoxPanelLayout.setHorizontalGroup(
            complainBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(complainBoxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        complainBoxPanelLayout.setVerticalGroup(
            complainBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(complainBoxPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addGap(24, 24, 24))
        );

        jLabel12.setBackground(new java.awt.Color(255, 212, 96));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(45, 64, 89));
        jLabel12.setText("Client name");

        jLabel16.setBackground(new java.awt.Color(255, 212, 96));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(45, 64, 89));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Homepage");

        clientName.setBackground(new java.awt.Color(255, 212, 96));
        clientName.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        clientName.setForeground(new java.awt.Color(45, 64, 89));
        clientName.setText("---");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(clientName))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(payBillPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fundTransferPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(withdrawFundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(statementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mobileRechargePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(complainBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(clientName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fundTransferPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobileRechargePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawFundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(complainBoxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payBillPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 212, 96));
        backButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(234, 84, 85));
        backButton.setText("Back");

        fundTransferButton.setBackground(new java.awt.Color(255, 212, 96));
        fundTransferButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        fundTransferButton.setForeground(new java.awt.Color(234, 84, 85));
        fundTransferButton.setText("Fund Transfer");
        fundTransferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundTransferButtonActionPerformed(evt);
            }
        });

        withdrawFundButton.setBackground(new java.awt.Color(255, 212, 96));
        withdrawFundButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        withdrawFundButton.setForeground(new java.awt.Color(234, 84, 85));
        withdrawFundButton.setText("Withdraw Fund");
        withdrawFundButton.setActionCommand("Withdraw");
        withdrawFundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawFundButtonActionPerformed(evt);
            }
        });

        mobileRechargeButton.setBackground(new java.awt.Color(255, 212, 96));
        mobileRechargeButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        mobileRechargeButton.setForeground(new java.awt.Color(234, 84, 85));
        mobileRechargeButton.setText("Mobile Recharge");
        mobileRechargeButton.setActionCommand("Withdraw");
        mobileRechargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileRechargeButtonActionPerformed(evt);
            }
        });

        payBillButton.setBackground(new java.awt.Color(255, 212, 96));
        payBillButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        payBillButton.setForeground(new java.awt.Color(234, 84, 85));
        payBillButton.setText("Pay Bill");
        payBillButton.setActionCommand("Withdraw");
        payBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBillButtonActionPerformed(evt);
            }
        });

        statementButton.setBackground(new java.awt.Color(255, 212, 96));
        statementButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        statementButton.setForeground(new java.awt.Color(234, 84, 85));
        statementButton.setText("Statement");
        statementButton.setActionCommand("Withdraw");
        statementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statementButtonActionPerformed(evt);
            }
        });

        complainBoxButton.setBackground(new java.awt.Color(255, 212, 96));
        complainBoxButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        complainBoxButton.setForeground(new java.awt.Color(234, 84, 85));
        complainBoxButton.setText("Complain Box");
        complainBoxButton.setActionCommand("Withdraw");
        complainBoxButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        complainBoxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complainBoxButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 212, 96));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("East West University Bank Limited");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logoutButton.setBackground(new java.awt.Color(255, 212, 96));
        logoutButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(234, 84, 85));
        logoutButton.setText("Log Out");
        logoutButton.setActionCommand("Withdraw");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fundTransferButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(withdrawFundButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(payBillButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(statementButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(complainBoxButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(mobileRechargeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(minimizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeButton)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minimizeButton)
                        .addComponent(closeButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fundTransferButton)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton)
                        .addGap(34, 34, 34))))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeButtonActionPerformed

    private void fundTransferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundTransferButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fundTransferButtonActionPerformed

    private void withdrawFundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawFundButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawFundButtonActionPerformed

    private void mobileRechargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileRechargeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileRechargeButtonActionPerformed

    private void payBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBillButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payBillButtonActionPerformed

    private void statementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statementButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statementButtonActionPerformed

    private void complainBoxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complainBoxButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complainBoxButtonActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel clientName;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton complainBoxButton;
    private javax.swing.JPanel complainBoxPanel;
    private javax.swing.JButton fundTransferButton;
    private javax.swing.JPanel fundTransferPanel;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JButton mobileRechargeButton;
    private javax.swing.JPanel mobileRechargePanel;
    private javax.swing.JButton payBillButton;
    private javax.swing.JPanel payBillPanel;
    private javax.swing.JButton statementButton;
    private javax.swing.JPanel statementPanel;
    private javax.swing.JButton withdrawFundButton;
    private javax.swing.JPanel withdrawFundPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setAllListeners() {
        ClientFundTransfer clientFundTransfer = guiManager.getClientFundTransfer();
        ClientComplainPage clientComplainPage = guiManager.getClientComplainPage();
        ClientStatement clientStatement = guiManager.getClientStatement();
        ClientMobileRecharge clientMobileRecharge = guiManager.getClientMobileRecharge();
        ClientWithdrawCash clientWithdrawCash = guiManager.getClientWithdrawCash();
        ClientUtilityBill clientUtilityBill = guiManager.getClientUtilityBill();
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                loadVisibleData();
            }
        });
        
        navigateOnMouseAction(fundTransferPanel, clientFundTransfer);
        navigateOnMouseAction(complainBoxPanel, clientComplainPage);
        navigateOnMouseAction(statementPanel, clientStatement);
        navigateOnMouseAction(payBillPanel, clientUtilityBill);
        navigateOnMouseAction(mobileRechargePanel, clientMobileRecharge);
        navigateOnMouseAction(withdrawFundPanel, clientWithdrawCash);
        
        navigateOnButtonAction(fundTransferButton, clientFundTransfer);
        navigateOnButtonAction(complainBoxButton, clientComplainPage);
        navigateOnButtonAction(statementButton, clientStatement);
        navigateOnButtonAction(payBillButton, clientUtilityBill);
        navigateOnButtonAction(mobileRechargeButton, clientMobileRecharge);
        navigateOnButtonAction(withdrawFundButton, clientWithdrawCash);

        setBackButtonAction(backButton);
        setMinimizeButtonAction(minimizeButton);
        setLogoutButtonAction(logoutButton);
        setCloseButtonAction(closeButton);
    }

    @Override
    public void loadVisibleData() {
        clientName.setText(guiManager.getUserClient().getName());
    }


}
