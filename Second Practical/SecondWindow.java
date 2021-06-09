import java.awt.*;

public class SecondWindow {
    SecondWindow() {
        Frame f = new Frame();
        f.setTitle("Added from method");
        Dimension dimension = new Dimension(300, 300);
        f.setSize(dimension);   //f.setsize(300,300); yo gare ni hunxa
        f.setVisible(true);

    }

    public static void main(String[] args) {
        SecondWindow f = new SecondWindow();
    }
}