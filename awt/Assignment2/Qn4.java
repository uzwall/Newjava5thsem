package Assignment2;

import java.awt.*;
import java.awt.event.*;

public class Qn4 extends Frame {

    public Qn4() {
        TextField input = new TextField(10);
        TextField output = new TextField(10);
        Button find = new Button("find factorial");
        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int n = Integer.parseInt(input.getText());
                int fact = 1;
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                output.setText(String.valueOf(fact));
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
        add(input);
        add(output);
        add(find);
    }

    public static void main(String[] args) {
        new Qn4();
    }
}
