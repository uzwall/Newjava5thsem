
import java.awt.*;
import java.awt.event.*;


public class CheckboxDemo extends Frame {
    CheckboxDemo() {
        setLayout(new GridLayout(2,3));
        Checkbox red = new Checkbox("Red");
        Checkbox blue = new Checkbox("Blue", true);
        Checkbox green = new Checkbox("Green", true);
        add(red);
        add(green);
        add(blue);
        addWindowListener(new WindowListener() { //for closing window (X)
            @Override
            public void windowOpened(WindowEvent windowEvent) {

            }

            @Override
            public void windowClosing(WindowEvent windowEvent) { //this close the window
                setVisible(false);
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent windowEvent) {

            }

            @Override
            public void windowIconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeiconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowActivated(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeactivated(WindowEvent windowEvent) {

            }
        });
        CheckboxGroup gender = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", gender, false);
        Checkbox female = new Checkbox("Female", false, gender);
        Checkbox other = new Checkbox("Other", gender, true);
        add(male);
        add(female);
        add(other);
        setSize(500, 500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CheckboxDemo();
    }

}
