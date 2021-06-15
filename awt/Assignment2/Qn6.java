package Assignment2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Qn6 extends Frame {
    public Qn6() {
        Label l1 = new Label(" Enter the Principal");
        TextField t1 = new TextField(10);
        Label l2 = new Label(" Enter the Time");
        TextField t2 = new TextField(10);
        Label l3 = new Label(" Enter the Rate");
        TextField t3 = new TextField(10);
        Button find = new Button("Find Simple Interest");
        Label l4 = new Label(" ");

        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int p = Integer.parseInt(t1.getText());
                int t = Integer.parseInt(t2.getText());
                int r = Integer.parseInt(t3.getText());
                l4.setText("Simple Interest: " + String.valueOf((p * r * t) / 100));

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
        setVisible(true);
        setSize(500, 500);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(find);
        add(l4);
    }

    public static void main(String[] args) {
        new Qn6();
    }
}
