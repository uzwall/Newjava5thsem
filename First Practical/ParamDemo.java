import java.applet.*;
import java.awt.*;
/* 
<applet code ="ParamDemo.class" width="300" height ="300">
<param name= username value = Uzwal Yo>
</applet>
*/
public class ParamDemo extends Applet{
    String username;
    public void start(){
        username=getParameter("username");
    }

public void paint (Graphics g){
    g.drawString("Username is : "+username,1,9);
}
}