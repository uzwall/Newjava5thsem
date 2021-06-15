package Assignment2;

import java.awt.*;
import java.awt.event.*;

public class Qn3 extends Frame {
    public Qn3() {
        Choice Subject = new Choice();
        Subject.addItem("Java");
        Subject.addItem("AIW");
        Subject.addItem("Macro Economics");
        Subject.addItem("Marketing");
        Subject.addItem("CG");
        TextField textField = new TextField(20);
        Subject.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
//                String text = Subject.getSelectedItem();
//                textField.setText(text);
                textField.setText(Subject.getSelectedItem());
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        add(Subject);
        add(textField);

    }

    public static void main(String[] args) {
        new Qn3();
    }
}
