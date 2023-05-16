package bank.management.gui;

import bank.management.GUIManager;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComponent;
public abstract class JFrameBase extends JFrame {
    final private int titleBarHeight = 50;
    final protected GUIManager guiManager;
    private boolean isDraggable;
    private int prevMouseX;
    private int prevMouseY;

    
    JFrameBase(GUIManager guiManager) {
        this.guiManager = guiManager;
        makeDraggable();
    }
    
    abstract public void setAllListeners();
    abstract public void loadVisibleData();
    
    private void makeDraggable() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // handle click if needed
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                updateMouse(e);
                isDraggable = false;
            }
            
            
        });
        
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (!isDraggable) updateMouse(e);
                Point location = getLocation();
                Point newLocation = new Point(
                     location.x + (e.getX() - prevMouseX),
                     location.y + (e.getY() - prevMouseY)
                );
                guiManager.getNavigator().setLocation(newLocation);
            }
        });
    }
    
    public void placeOnCenter() {    // must be invoked after all of the inner components are added 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        int posX = (int) (width-this.getWidth())/2;
        int posY = (int) (height-this.getHeight())/2;
        this.setLocation(posX, posY);
    }
    
    private void updateMouse(MouseEvent e) { // update mouse position while dragging
        isDraggable = e.getY() <= titleBarHeight;
        prevMouseX = e.getX();
        prevMouseY = e.getY();
    }
    
    protected void setCloseButtonAction(JButton closeButton) {
        closeButton.addActionListener((ActionEvent e) -> {
            try {
                guiManager.getDBManager().requestDBUpdate();
            } catch (IOException ex) {
                Logger.getLogger(JFrameBase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JFrameBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        });
    }
    
    protected void setBackButtonAction(JButton backButton) {
        backButton.addActionListener((ActionEvent e) -> {
            guiManager.getNavigator().back();
        });
    }
    
    protected void setMinimizeButtonAction(JButton minimizeButton) {
        minimizeButton.addActionListener((ActionEvent e) -> {
            setExtendedState(Frame.ICONIFIED);
        });
    }
    
    protected void setLogoutButtonAction(JButton button) {
        button.addActionListener((ActionEvent e) -> {
            guiManager.getNavigator().navigate(guiManager.getLoginScreen());
        });
    }
    
    protected void toggleButtonEnable(String[] values, JButton button) {
        for (String value : values) {
            if (value.isEmpty()) {
                button.setEnabled(false);
                return;
            }
        }
        button.setEnabled(true);
    }
    
    protected void navigateOnButtonAction(JButton button, JFrameBase navigateTo) {
        button.addActionListener((ActionEvent e) -> {
            guiManager.getNavigator().navigate(navigateTo);
        });
    }

    protected void navigateOnMouseAction(JComponent component, JFrameBase navigateTo) {
        component.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                guiManager.getNavigator().navigate(navigateTo);
            }
        });
    }
}
