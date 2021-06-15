package Assignment2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Qn5 extends Frame {
    public Qn5() {
        TextField textField = new TextField(20);
        Button show = new Button("Print");
        Button clear = new Button("Clear");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText("Hello World !!");
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText(null);
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
        add(textField);
        add(show);
        add(clear);

    }

    public static void main(String[] args) {
        new Qn5();
    }
}
