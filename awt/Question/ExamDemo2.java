package Question;
//Create a awt GUI that contains a combo box and text field. When a option is selected in combo box, display it in text field.

import java.awt.*;
import java.awt.event.*;

public class ExamDemo2 extends Frame {
    public ExamDemo2() {

        Choice choice = new Choice();
        choice.addItem("Java");
        choice.addItem("PHP");
        choice.addItem("C");
        choice.addItem("C++");
        choice.addItem("Kotlin");
        choice.addItem("C#");
        TextField textField = new TextField(20);
        choice.addItemListener(new ItemListener() {  //without button
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                String newtext = choice.getSelectedItem();
                textField.setText(newtext);
            }
        });


//        Button button = new Button("show");
//        button.addActionListener(new ActionListener() {   //with button
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                String newtext = choice.getSelectedItem();
//                textField.setText(newtext);
//            }
//        });

        String newtext = choice.getSelectedItem();
        textField.setText(newtext);
        add(choice);
//        add(button);
        add(textField);
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ExamDemo2();
    }
}
