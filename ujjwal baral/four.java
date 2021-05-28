//WAP an  applet program that takes  a string as parameter and checks whether thelength of the string is less than 6 character or not.
import java.applet.*;
import java.awt.*;
/*
<applet code="four.class" width=500 height=500>
<param name= username value = Ujjwal>
</applet>
*/

public class four extends Applet{

    public String Fname;
    public void start(){
        Fname= getParameter("username");
    }
    public void paint (Graphics g){
        if (Fname.length()<6){
            g.drawString("The length of String("+Fname+") is less than 6 character",100,100);
        }
        else{
            g.drawString("The length of String("+Fname+") is not less than 6 character",100,100);
        }
    }
}