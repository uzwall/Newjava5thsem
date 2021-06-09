import java.awt.*;
import java.awt.event.*;

public class WorkingWithWindow extends Frame {
    WorkingWithWindow() {

        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.out.println("Closing");
                System.exit(0);
                setVisible(false);
            }
        });


    }

    public static void main(String[] args) {
        new WorkingWithWindow();
    }
}