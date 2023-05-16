/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bank.management.gui;

import bank.management.Client;
import bank.management.DBManager;
import bank.management.GUIManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Saif
 */
public class ManagerClientInfo extends JFrameBase {

    /**
     * Creates new form Manager_Client_Info
     * @param guiManager
     */
    public ManagerClientInfo(GUIManager guiManager) {
        super(guiManager);
        initComponents();
        placeOnCenter();
    }

    public JTextField getAddress() {
        return address;
    }

    public JTable getDataTable() {
        return dataTable;
    }

    public JTextField getBalance() {
        return balance;
    }

    public JTextField getClientName() {
        return clientName;
    }

    public JTextField getNationalID() {
        return nationalID;
    }

    public JTextField getPassword() {
        return password;
    }

    public JTextField getPhone() {
        return phone;
    }

    public JTextField getUsername() {
        return username;
    }

    public JButton getRegisterClientButton() {
        return registerClientButton;
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

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getComplainsMenu() {
        return complainsMenu;
    }

    public JButton getDashboardMenu() {
        return dashboardMenu;
    }

    public JButton getHomepageMenu() {
        return homepageMenu;
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
        clientName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nationalID = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        registerClientButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        dashboardMenu = new javax.swing.JButton();
        homepageMenu = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        complainsMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(240, 123, 63));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));

        jPanel2.setBackground(new java.awt.Color(238, 190, 165));

        jPanel3.setBackground(new java.awt.Color(240, 123, 63));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 64, 89));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Name:");

        clientName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        clientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 64, 89));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Phone:");

        phone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(45, 64, 89));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Address:");

        address.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(45, 64, 89));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("National ID:");

        nationalID.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        username.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(45, 64, 89));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Username");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(45, 64, 89));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Password");

        password.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "SL", "ID", "Name", "Phone", "National ID", "Username", "Current Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        dataTable.setEnabled(false);
        dataTable.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(dataTable);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(45, 64, 89));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Initial Amount");

        balance.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        registerClientButton.setBackground(new java.awt.Color(255, 212, 96));
        registerClientButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        registerClientButton.setForeground(new java.awt.Color(234, 84, 85));
        registerClientButton.setText("Save");
        registerClientButton.setActionCommand("Withdraw");
        registerClientButton.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(nationalID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(password))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(registerClientButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerClientButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );

        jLabel12.setBackground(new java.awt.Color(255, 212, 96));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(45, 64, 89));
        jLabel12.setText("Manager name");

        jLabel16.setBackground(new java.awt.Color(255, 212, 96));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(45, 64, 89));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Client Information Center");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(525, 525, 525))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        closeButton.setBackground(new java.awt.Color(240, 123, 63));
        closeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        closeButton.setText("X");
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        minimizeButton.setBackground(new java.awt.Color(240, 123, 63));
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

        dashboardMenu.setBackground(new java.awt.Color(255, 212, 96));
        dashboardMenu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dashboardMenu.setForeground(new java.awt.Color(234, 84, 85));
        dashboardMenu.setText("Dashboard");
        dashboardMenu.setActionCommand("Withdraw");

        homepageMenu.setBackground(new java.awt.Color(255, 212, 96));
        homepageMenu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        homepageMenu.setForeground(new java.awt.Color(234, 84, 85));
        homepageMenu.setText("Home");
        homepageMenu.setActionCommand("Withdraw");

        logoutButton.setBackground(new java.awt.Color(255, 212, 96));
        logoutButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(234, 84, 85));
        logoutButton.setText("Log Out");
        logoutButton.setActionCommand("Withdraw");

        complainsMenu.setBackground(new java.awt.Color(255, 212, 96));
        complainsMenu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        complainsMenu.setForeground(new java.awt.Color(234, 84, 85));
        complainsMenu.setText("Complains");
        complainsMenu.setActionCommand("Withdraw");

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
                            .addComponent(dashboardMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(homepageMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(complainsMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(homepageMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashboardMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(complainsMenu)
                        .addGap(458, 458, 458)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField clientName;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton complainsMenu;
    private javax.swing.JButton dashboardMenu;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton homepageMenu;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JTextField nationalID;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    private javax.swing.JButton registerClientButton;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setAllListeners() {
        ManagerDashboard managerDashboard = guiManager.getManagerDashboard();
        ManagerHomepage managerHomepage = guiManager.getManagerHomepage();
        Complains complains = guiManager.getComplains();


        registerNewClient(registerClientButton);
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                loadVisibleData();
            }
        });

        ActionListener enterPressListener = (ActionEvent e) -> registerClientButton.doClick();
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

        clientName.getDocument().addDocumentListener(documentListener);
        clientName.addActionListener(enterPressListener);
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
        navigateOnButtonAction(complainsMenu, complains);
        
        setBackButtonAction(backButton);
        setMinimizeButtonAction(minimizeButton);
        setLogoutButtonAction(logoutButton);
        setCloseButtonAction(closeButton);
    }
    
    
    private void toggleRegisterButton() {
        String[] data = new String[7];
        data[0] = clientName.getText();
        data[1] = address.getText();
        data[2] = nationalID.getText();
        data[3] = phone.getText();
        data[4] = username.getText();
        data[5] = password.getText();
        data[6] = balance.getText();
        toggleButtonEnable(data, registerClientButton);
    }
    
    private void registerNewClient(JButton button) {
        DBManager dbManager = guiManager.getDBManager();
        
        button.addActionListener((ActionEvent e) -> {
            
            HashMap<String, String> credentialDB = dbManager.getCredentialDB();
            if (credentialDB.containsKey(username.getText())) {
                JOptionPane.showMessageDialog(ManagerClientInfo.this, "Username already exists!", "Error", 0);   
                return;
            }
            try {
                ArrayList<Client> clientDB = dbManager.getClientDB();
                String accountNo = "EWUBL0" + (1000 + clientDB.size());
                Client newClient = new Client(clientName.getText(), phone.getText(), accountNo, address.getText(), nationalID.getText(), username.getText(), password.getText(), Double.parseDouble(balance.getText()));
                clientDB.add(newClient);
                credentialDB.put(username.getText(), password.getText());
                JOptionPane.showMessageDialog(this, "New client added!");
                clearAllFields();
                loadVisibleData();
            } catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(ManagerClientInfo.this, "Invalid amount!");
            }
        });
    }
    
    private void clearAllFields() {
        clientName.setText("");
        address.setText("");
        phone.setText("");
        nationalID.setText("");
        username.setText("");
        password.setText("");
        balance.setText("");
    }

    @Override
    public void loadVisibleData() {
        guiManager.loadManagerClientInfoData();
    }
}
