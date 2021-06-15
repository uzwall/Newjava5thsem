package Assignment2;

import java.awt.*;
import java.awt.event.*;


public class Qn2 extends Frame {
    public Qn2() {
        CheckboxGroup gender = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", gender, false);
        Checkbox female = new Checkbox("Female", gender, true);
        Checkbox other = new Checkbox("Other", gender, false);
        Label fruit = new Label("which fruit do you like : ");
        Checkbox Apple = new Checkbox("Apple", true);
        Checkbox Mango = new Checkbox("Mango", false);
        Checkbox Banana = new Checkbox("Banana", true);
        Checkbox Orange = new Checkbox("Orange", false);
        Checkbox pineapple = new Checkbox("Pineapple", false);
        setLayout(new FlowLayout());
        setSize(500, 500);
        add(male);
        add(female);
        add(other);
        add(fruit);
        add(Apple);
        add(Mango);
        add(Orange);
        add(Banana);
        add(pineapple);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Qn2();
    }
}
