package bank.management.gui;

import bank.management.GUIManager;
import java.awt.Color;
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
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

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
                if (!isDraggable) {
                    updateMouse(e);
                }
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
        int posX = (int) (width - this.getWidth()) / 2;
        int posY = (int) (height - this.getHeight()) / 2;
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

    class GradientBackgroundPanel extends JPanel {

        private Direction direction;
        private Color color1;
        private Color color2;

        enum Direction {
            LEFT_TO_RIGHT,
            TOP_TO_BOTTOM,
            TOP_LEFT_TO_BOTTOM_RIGHT,
            TOP_RIGHT_TO_BOTTOM_LEFT
        };

        public GradientBackgroundPanel(Color color1, Color color2, Direction direction) {
            this.color1 = color1;
            this.color2 = color2;
            this.direction = direction;
        }

        public GradientBackgroundPanel(String color1, String color2, Direction direction) {
            this(new Color(Integer.parseInt(color1, 16)), new Color(Integer.parseInt(color2, 16)), direction);
        }

        public GradientBackgroundPanel(int r1, int g1, int b1, int r2, int g2, int b2, Direction direction) {
            this(new Color(r1, g1, b1), new Color(r2, g2, b2), direction);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
            switch (direction) {
                case LEFT_TO_RIGHT -> {
                    x1 = 0;
                    y1 = 0;
                    x2 = getWidth();
                    y2 = 0;
                }
                case TOP_TO_BOTTOM -> {
                    x1 = 0;
                    y1 = 0;
                    x2 = 0;
                    y2 = getHeight();
                }
                case TOP_LEFT_TO_BOTTOM_RIGHT -> {
                    x1 = 0;
                    y1 = 0;
                    x2 = getWidth();
                    y2 = getHeight();
                }
                case TOP_RIGHT_TO_BOTTOM_LEFT -> {
                    x1 = getWidth();
                    y1 = 0;
                    x2 = 0;
                    y2 = getHeight();
                }
            }

            GradientPaint gradient = new GradientPaint(x1, y1, color1, x2, y2, color2);

            Graphics2D graphics = (Graphics2D) g;
            graphics.setPaint(gradient);
            graphics.fillRect(0, 0, getWidth(), getHeight());
        }

    }

    public static void addColorChangeOnHover(JButton button, String newColor, String newFontColor, String oldColor, String oldFontColor) {
        
        Color hoverColor = Color.decode('#' + newColor);
        Color fontHoverlColor = Color.decode('#' + newFontColor);
        Color normalColor = Color.decode('#' + oldColor);
        Color fontNormalColo = Color.decode('#' + oldFontColor);
        
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(hoverColor);
                button.setForeground(fontHoverlColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(normalColor);
                button.setForeground(fontNormalColo);
            }
        });
    }
}
