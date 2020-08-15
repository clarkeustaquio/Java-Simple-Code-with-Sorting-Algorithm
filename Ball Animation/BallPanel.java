import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BallPanel extends JPanel
{
    private int x = 1, y = 1, xx = 880, yy = 1;
    private int xVelocity = 1, yVelocity = 1, velocityX = 1, velocityY = 1;
    private int width = 100, height = 100, xWidth = 100, xHeight = 100;
    private static int speed = 50;
    private JButton play, pause, increase, decrease;
    private Timer timer;
    public BallPanel(){
        play = new JButton("Play");
        pause = new JButton("Pause");
        increase = new JButton("+");
        decrease = new JButton("-");
        
        play.setBounds(400, 100, 100, 100);
        pause.setBounds(500, 100, 100, 100);
        increase.setBounds(600, 100, 100, 100);
        decrease.setBounds(700, 100, 100, 100);
        
        increase.addActionListener(new Increase());
        decrease.addActionListener(new Decrease());
        play.addActionListener(new Play());
        pause.addActionListener(new Pause());
        timer = new Timer(speed, new Action());
        
        add(play);
        add(pause);
        add(increase);
        add(decrease);
    }
    public class Increase implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            speed -= 10;
            if(speed == -10)
                speed = 0;
               
            timer.stop();
            timer.setDelay(speed);
            timer.start();
            
            System.out.println(speed);
        }
    }
    public class Decrease implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            speed += 10;
            timer.stop();
            timer.setDelay(speed);
            timer.start();
            
            System.out.println(speed);
        }
    }
    public class Play implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            
            timer.start();
        }
    }
    public class Pause implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            timer.stop();
        }
    }    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.fillOval(x, y, width, height);
        
        g2.setColor(Color.YELLOW);
        g2.fillOval(xx, yy, xWidth, xHeight);
        
    }
    public class Action implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            x = x + xVelocity;
            y = y + yVelocity;
            xx = xx - velocityX;
            yy = yy - velocityY;
            
            if(x >= 1000-width-10 || x <= 0){
                xVelocity = -xVelocity;
            }
            /*if(x == 0){
                x = 0;
                xVelocity = 0;
            }*/
                
            
            if(y >= 750-height-50|| y <= 0){
                yVelocity = -yVelocity;
            }
            
            
            if(xx >= 1000-width-10 || xx <= 0){
                velocityX = -velocityX;
            }
            
            if(yy >= 750-height-50|| yy <= 0){
                velocityY = -velocityY;
            }
            
            repaint();
        }
    }

}
