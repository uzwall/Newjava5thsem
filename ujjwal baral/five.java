/* Wap to create the following Shapes
    a. Rectangle with border color Red
    b. Square with border color Blue
    c.Circle with border color Green
*/
import java.applet.*;
import java.awt.*;
/*
<applet code="five.class" width=500 height=500>

</applet>
*/
 public class five extends Applet{

    public void paint (Graphics g){
        g.setColor(Color.RED);
        g.drawRect (50,50,200,100);

        g.setColor(Color.BLUE);
        g.drawRect (50,200,100,100);

        
        g.setColor(Color.GREEN);
        g.drawOval (50,340,150,150);
    }

 }