package Assignment2;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Qn7 extends Frame {
    public Qn7() {
        Choice Country = new Choice();
        Country.addItem("Nepal");
        Country.addItem("India");
        Country.addItem("United Kingdom");
        Country.addItem("Japan");
        Country.addItem("America");
        TextField textField = new TextField(20);
        Country.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
//                String text = Country.getSelectedItem();
//                textField.setText(text);
                textField.setText(Country.getSelectedItem());
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
        add(Country);
        add(textField);

    }

    public static void main(String[] args) {
        new Qn7();
    }

}
