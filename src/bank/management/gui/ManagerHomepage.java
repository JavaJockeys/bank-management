package bank.management.gui;

import bank.management.GUIManager;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ManagerHomepage extends JFrameBase {

    /**
     * Creates new form Manager_Homepage
     *
     * @param guiManager
     */
    public ManagerHomepage(GUIManager guiManager) {
        super(guiManager);
        initComponents();
        placeOnCenter();
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getClientInfoMenu() {
        return clientInfoMenu;
    }

    public JPanel getClientInfoPanel() {
        return clientInfoPanel;
    }

    public JButton getComplainMenu() {
        return complainMenu;
    }

    public JPanel getComplainPanel() {
        return complainPanel;
    }

    public JButton getDashboardMenu() {
        return dashboardMenu;
    }

    public JPanel getDashboardPanel() {
        return dashboardPanel;
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
        complainMenu = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        clientInfoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profCI = new javax.swing.JButton();
        dashboardPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        profD = new javax.swing.JButton();
        complainPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        profComp = new javax.swing.JButton();

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

        complainMenu.setBackground(new java.awt.Color(255, 212, 96));
        complainMenu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        complainMenu.setForeground(new java.awt.Color(234, 84, 85));
        complainMenu.setText("Complains");
        complainMenu.setActionCommand("Withdraw");

        logoutButton.setBackground(new java.awt.Color(255, 212, 96));
        logoutButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(234, 84, 85));
        logoutButton.setText("Log Out");
        logoutButton.setActionCommand("Withdraw");

        jLabel12.setBackground(new java.awt.Color(255, 212, 96));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(45, 64, 89));
        jLabel12.setText("Manager");

        jLabel16.setBackground(new java.awt.Color(255, 212, 96));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(45, 64, 89));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Homepage");

        clientInfoPanel.setBackground(new java.awt.Color(254, 247, 181));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/clientinfo.gif"))); // NOI18N

        profCI.setBackground(new java.awt.Color(255, 212, 96));
        profCI.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        profCI.setForeground(new java.awt.Color(234, 84, 85));
        profCI.setText("Client Info");

        javax.swing.GroupLayout clientInfoPanelLayout = new javax.swing.GroupLayout(clientInfoPanel);
        clientInfoPanel.setLayout(clientInfoPanelLayout);
        clientInfoPanelLayout.setHorizontalGroup(
            clientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(profCI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clientInfoPanelLayout.setVerticalGroup(
            clientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(profCI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboardPanel.setBackground(new java.awt.Color(254, 247, 181));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/dashboard.gif"))); // NOI18N

        profD.setBackground(new java.awt.Color(255, 212, 96));
        profD.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        profD.setForeground(new java.awt.Color(234, 84, 85));
        profD.setText("Dashboard");
        profD.setActionCommand("Withdraw");

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(profD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(profD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        complainPanel.setBackground(new java.awt.Color(254, 247, 181));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/management/icons/report.gif"))); // NOI18N

        profComp.setBackground(new java.awt.Color(255, 212, 96));
        profComp.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        profComp.setForeground(new java.awt.Color(234, 84, 85));
        profComp.setText("Complains");
        profComp.setActionCommand("Withdraw");

        javax.swing.GroupLayout complainPanelLayout = new javax.swing.GroupLayout(complainPanel);
        complainPanel.setLayout(complainPanelLayout);
        complainPanelLayout.setHorizontalGroup(
            complainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(complainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(profComp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        complainPanelLayout.setVerticalGroup(
            complainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(complainPanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(profComp)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(complainMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dashboardMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(clientInfoMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clientInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 22, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(35, 35, 35)
                                        .addComponent(minimizeButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(closeButton))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton)
                        .addComponent(minimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientInfoMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashboardMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(complainMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(clientInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(complainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(371, 371, 371))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getCloseButton() {
        return closeButton;
    }

    public JButton getMinimizeButton() {
        return minimizeButton;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clientInfoMenu;
    private javax.swing.JPanel clientInfoPanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton complainMenu;
    private javax.swing.JPanel complainPanel;
    private javax.swing.JButton dashboardMenu;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JButton profCI;
    private javax.swing.JButton profComp;
    private javax.swing.JButton profD;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setAllListeners() {
        ManagerClientInfo managerClientInfo = guiManager.getManagerClientInfo();
        ManagerDashboard managerDashboard = guiManager.getManagerDashboard();
        Complains complains = guiManager.getComplains();

        navigateOnButtonAction(clientInfoMenu, managerClientInfo);
        navigateOnButtonAction(dashboardMenu, managerDashboard);
        navigateOnButtonAction(complainMenu, complains);

        navigateOnButtonAction(profCI, managerClientInfo);
        navigateOnButtonAction(profD, managerDashboard);
        navigateOnButtonAction(profComp, complains);

        navigateOnMouseAction(clientInfoPanel, managerClientInfo);
        navigateOnMouseAction(dashboardPanel, managerDashboard);
        navigateOnMouseAction(complainPanel, complains);

        setBackButtonAction(backButton);
        setMinimizeButtonAction(minimizeButton);
        setLogoutButtonAction(logoutButton);
        setCloseButtonAction(closeButton);

        profCI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        profD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        profComp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        clientInfoMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dashboardMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        complainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        minimizeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logoutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        minimizeButton.setOpaque(false);
        closeButton.setOpaque(false);

        addColorChangeOnHover(profCI, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(profD, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(profComp, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(clientInfoMenu, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(dashboardMenu, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(complainMenu, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(logoutButton, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(backButton, "FF1000", "FFD460", "FFD460", "EA5455");
        addColorChangeOnHover(minimizeButton, "FF1000", "FFD460", "FFD460", "000000");
        addColorChangeOnHover(closeButton, "FF1000", "FFD460", "FFD460", "000000");
    }

    @Override
    public void loadVisibleData() {

    }
}
