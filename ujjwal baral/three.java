// Wap  an applet program that display your rollno , name and email address in three different lines.
import java.applet.*;
import java.awt.*;
/*/*
<applet code="three.class" width=500 height=500>

</applet>
*/
public class three extends Applet{
    public void paint (Graphics g)
{
    g.drawString("Name: Ujjwal Baral",100,100); 
    g.drawString("Rollno: 3980",100,120);
    g.drawString("Email: Ujjwal.Baral@gmail.com",100,140);


    
}
     
 }
