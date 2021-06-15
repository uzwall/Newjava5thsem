package Question;

//WAP that takes two number from user and display the sum in new label when a add button is clicked


import java.awt.*;
import java.awt.event.*;

public class ExamDemo1 extends Frame {
    ExamDemo1() {
        Label l1 = new Label("Enter the first number:");
        Label l2 = new Label("Enter the Second number");
        Label l3 = new Label(" ");
        TextField t1 = new TextField(20);
        TextField t2 = new TextField(20);
        Button b = new Button("sum");
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionEvent) {
                int n1 = Integer.parseInt(t1.getText().trim());
                int n2 = Integer.parseInt(t2.getText().trim());
                int sum = n1 + n2;
                l3.setText(String.valueOf(sum));


            }
        });
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {

            }

            @Override
            public void windowClosing(WindowEvent windowEvent) {
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

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);
        setLayout(new FlowLayout());
        setSize(700, 700);
        setVisible(true);


    }

    public static void main(String args[]) {
        new ExamDemo1();
    }

}
