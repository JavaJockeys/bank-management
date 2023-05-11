package bank.management;



import bank.management.gui.JFrameBase;
import bank.management.gui.Splash;
import java.awt.Point;


/**
 *
 * @author Osama
 */
public class Navigator {

    private JFrameBase[] frames;
    private int framePointer;
    private Point defaultLocation;
  
    public Navigator() {
        this.framePointer = -1;
        this.frames = new JFrameBase[20];
    }
    
    public void back() {
        if (framePointer <= 1) {
            return;
        }
        JFrameBase current = this.frames[this.framePointer];
        current.setVisible(false);
        current = this.frames[--this.framePointer];
        current.setVisible(true);
    }
    
    public void navigate(JFrameBase frame) {
        if (this.framePointer == -1) {
            this.frames[++this.framePointer] = frame;
            frame.setVisible(true);
            return;
        }
        JFrameBase current = this.frames[this.framePointer];
        // searches the provided frame in the array
        int i = 0;
        boolean found = false;
        while (i < this.framePointer && this.frames[i] != frame) i++;
        if (i != this.framePointer) found = true;
        while (i < this.framePointer) frames[i] = frames[++i];
        this.frames[(found? this.framePointer : ++this.framePointer)] = frame;
        current.setVisible(false);
        current = this.frames[this.framePointer];
        if (!found && defaultLocation != null) current.setLocation(defaultLocation);
        current.setVisible(true);
        current.toFront();
    }
    
    public JFrameBase getCurrentFrame() throws nullFrameException {
        if (this.framePointer == -1) throw new nullFrameException();
        return (JFrameBase) frames[this.framePointer];
    }

    public void setLocation(Point point) {
        defaultLocation = point;
        for (JFrameBase frame: frames) {
            if (frame != null) frame.setLocation(point);
        }
    }

    public static class nullFrameException extends Exception {

        public nullFrameException() {
        }
    }
}
