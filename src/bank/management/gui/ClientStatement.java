/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bank.management.gui;

import bank.management.Navigator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Saif
 */
public class ClientStatement extends JFrameBase {
    
    public JButton getBackButton() {
        return backButton;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JButton getCloseButton() {
        return closeButton;
    }

    public JTextField getCurrentBalance() {
        return currentBalance;
    }

    public JButton getMinimizeButton() {
        return minimizeButton;
    }

    public JButton getFundTransferButton() {
        return fundTransferButton;
    }
    
    public JButton getComplainBoxButton() {
        return complainBoxButton;
    }

      public JButton getPayBillButton() {
        return  payBillButton;
    }
       public JButton getMobileRechargeButton() {
        return mobileRechargeButton;
    }
        public JButton getWithdrawFundButton() {
        return withdrawFundButton;
    }

    /**
     * Creates new form Client_Statement
     * @param navigator
     */
    public ClientStatement(Navigator navigator) {
        super(navigator);
        initComponents();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        currentBalance = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        fundTransferButton = new javax.swing.JButton();
        mobileRechargeButton = new javax.swing.JButton();
        payBillButton = new javax.swing.JButton();
        complainBoxButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        withdrawFundButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(234, 84, 85));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));

        jPanel2.setBackground(new java.awt.Color(247, 209, 209));

        jPanel3.setBackground(new java.awt.Color(234, 84, 85));

        jTable1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SL.", "TXN Date", "Amount", "Reciever", "TXN Type"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 212, 96));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Current Balance:");

        currentBalance.setEditable(false);
        currentBalance.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 221, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jLabel12.setBackground(new java.awt.Color(255, 212, 96));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(45, 64, 89));
        jLabel12.setText("Client name");

        jLabel16.setBackground(new java.awt.Color(255, 212, 96));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(45, 64, 89));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Bank Statement Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        closeButton.setBackground(new java.awt.Color(234, 84, 85));
        closeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        closeButton.setText("X");
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

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

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 212, 96));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("East West University Bank Limited");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        complainBoxButton.setBackground(new java.awt.Color(255, 212, 96));
        complainBoxButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        complainBoxButton.setForeground(new java.awt.Color(234, 84, 85));
        complainBoxButton.setText("Complain Box");
        complainBoxButton.setActionCommand("Withdraw");
        complainBoxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complainBoxButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 212, 96));
        logoutButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(234, 84, 85));
        logoutButton.setText("Log-Out");
        logoutButton.setActionCommand("Withdraw");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
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
                            .addComponent(fundTransferButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mobileRechargeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(payBillButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(complainBoxButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(withdrawFundButton, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(complainBoxButton)
                        .addGap(382, 382, 382)
                        .addComponent(logoutButton)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }//GEN-LAST:event_closeButtonMouseClicked

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeButtonActionPerformed

    private void fundTransferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundTransferButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fundTransferButtonActionPerformed

    private void mobileRechargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileRechargeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileRechargeButtonActionPerformed

    private void payBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBillButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payBillButtonActionPerformed

    private void complainBoxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complainBoxButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complainBoxButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void withdrawFundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawFundButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawFundButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton complainBoxButton;
    private javax.swing.JTextField currentBalance;
    private javax.swing.JButton fundTransferButton;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JButton mobileRechargeButton;
    private javax.swing.JButton payBillButton;
    private javax.swing.JButton withdrawFundButton;
    // End of variables declaration//GEN-END:variables
}
