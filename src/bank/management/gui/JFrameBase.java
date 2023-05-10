package bank.management.gui;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import bank.management.Navigator;

/**
 *
 * @author Osama
 */
public abstract class JFrameBase extends JFrame {
    final private int titleBarHeight = 50;
    private Navigator navigator;
    private boolean isDraggable;
    private int prevMouseX;
    private int prevMouseY;

    public Navigator getNavigator() {
        return navigator;
    }
    
    JFrameBase(Navigator navigator) {
        this.navigator = navigator;
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
                getNavigator().setLocation(newLocation);
            }
        });
    }
    
    public void placeOnCenter() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        int posX = (int) (width-this.getWidth())/2;
        int posY = (int) (height-this.getHeight())/2;
        this.setLocation(posX, posY);
    }
    
    public void back() {
        try {
            if (navigator.getCurrentFrame() == this)
                navigator.back();
        } catch (Navigator.nullFrameException ex) {
            
        }
    }
    
    private void updateMouse(MouseEvent e) {
        isDraggable = e.getY() <= titleBarHeight;
        prevMouseX = e.getX();
        prevMouseY = e.getY();
    }
}
