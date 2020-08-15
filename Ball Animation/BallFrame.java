import java.awt.*;
import javax.swing.*;

public class BallFrame extends JFrame
{
    public BallFrame(){
        BallPanel panel = new BallPanel();
        add(panel);
        
        setSize(1000, 750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ball");
        
        
        System.out.println(getWidth() + " " + getHeight());
    }
    
    public int width(){
        return getWidth();
    }
    public int height(){
        return getHeight();
    }
}
