import java.applet.*;
import java.awt.*;

public class AppletProgramming extends Applet{
    int count = 0;
    public void init(){
        System.out.println("Its Init method" + count++);
    }
    public void start(){
        System.out.println("Its Start method" + count++);
    }
    public void paint(Graphics g){
        System.out.println("Its paint method"+count++);
        g.drawString("Data String", 50, 20);
    }
    public void stop(){
        System.out.println("Its Stop Method "+count++);
    }
    public void destroy(){
        System.out.println("Its Destroy method "+count++);
    }
}
