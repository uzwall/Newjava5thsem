package Assignment2;

import java.awt.*;
import java.awt.event.*;

public class Qn1 extends Frame {

    public Qn1() {
        Label l1 = new Label("Enter the first number");
        Label l2 = new Label("Enter the second number");
        TextField t1 = new TextField(20);
        TextField t2 = new TextField(20);
        Label l3 = new Label("");

        Button button = new Button("Add");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int sum = n1 + n2;
                l3.setText("The sum of two number is : " + String.valueOf(sum));
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
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(button);
        add(l3);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Qn1();
    }
}
