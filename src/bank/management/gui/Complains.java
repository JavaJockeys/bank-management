
package bank.management.gui;

import bank.management.GUIManager;
import java.awt.Cursor;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Complains extends JFrameBase {

    /**
     * Creates new form Complains
     * @param guiManager
     */
    public Complains(GUIManager guiManager) {
        super(guiManager);
        initComponents();
        placeOnCenter();
         //jTextArea1.setEditable(false) ;
    }

    public JTextArea getComplainList() {
        return ComplainList;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JButton getMinimizeButton() {
        return minimizeButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getCloseButton() {
        return closeButton;
    }

    public JButton getClientInfoMenu() {
        return clientInfoMenu;
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

        jPanel1 = new JFrameBase.GradientBackgroundPanel("F07B3F", "ffff00", JFrameBase.GradientBackgroundPanel.Direction.TOP_TO_BOTTOM);
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        clientInfoMenu = new javax.swing.JButton();
        dashboardMenu = new javax.swing.JButton();
        homepageMenu = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComplainList = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(240, 123, 63));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));

        closeButton.setBackground(new java.awt.Color(240, 123, 63));
        closeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        closeButton.setText("X");
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);

        minimizeButton.setBackground(new java.awt.Color(240, 123, 63));
        minimizeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        minimizeButton.setText("-");
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

        clientInfoMenu.setBackground(new java.awt.Color(255, 212, 96));
        clientInfoMenu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        clientInfoMenu.setForeground(new java.awt.Color(234, 84, 85));
        clientInfoMenu.setLabel("Client Info");

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

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ComplainList.setColumns(20);
        ComplainList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ComplainList.setRows(5);
        jScrollPane1.setViewportView(ComplainList);
        ComplainList.setEditable(false) ;
        ComplainList.setLineWrap(true);
        ComplainList.setWrapStyleWord(true);
        ComplainList.setBorder(new EmptyBorder(20, 20, 20, 20));

        jLabel12.setBackground(new java.awt.Color(255, 212, 96));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(45, 64, 89));
        jLabel12.setText("Manager ");

        jLabel16.setBackground(new java.awt.Color(255, 212, 96));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(45, 64, 89));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Complains");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(jLabel16)
                        .addContainerGap(321, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dashboardMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(clientInfoMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(homepageMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(minimizeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closeButton)))
                        .addGap(33, 33, 33))))
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
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homepageMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientInfoMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashboardMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ComplainList;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clientInfoMenu;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton dashboardMenu;
    private javax.swing.JButton homepageMenu;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton minimizeButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setAllListeners() {
        ManagerDashboard managerDashboard = guiManager.getManagerDashboard();
        ManagerHomepage managerHomepage = guiManager.getManagerHomepage();
        ManagerClientInfo managerClientInfo = guiManager.getManagerClientInfo();

        navigateOnButtonAction(dashboardMenu, managerDashboard);
        navigateOnButtonAction(homepageMenu, managerHomepage);
        navigateOnButtonAction(clientInfoMenu, managerClientInfo);
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                loadVisibleData();
            }
        });
        
        setBackButtonAction(backButton);
        setMinimizeButtonAction(minimizeButton);
        setLogoutButtonAction(logoutButton);
        setCloseButtonAction(closeButton);
        
        clientInfoMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dashboardMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        minimizeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logoutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        minimizeButton.setOpaque(false);
        closeButton.setOpaque(false);
        
        addColorChangeOnHover(homepageMenu, "FF1000", "FFD460", "FFD460", "EA5455");
         addColorChangeOnHover(clientInfoMenu, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(dashboardMenu, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(logoutButton, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(backButton, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(minimizeButton, "FF1000", "FFD460", "FFD460", "000000");
        addColorChangeOnHover(closeButton, "FF1000", "FFD460", "FFD460", "000000");
    
    }

    @Override
    public void loadVisibleData() {
        guiManager.loadComplains();
    }
}
