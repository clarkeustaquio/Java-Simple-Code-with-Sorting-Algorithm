import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class HW extends JFrame{
    private JTextArea TAinput, TAoutput;
    private JLabel lblInput, lblOutput;
    private JButton btnGenerate;
    
    private JPanel pnlWest, pnlCenter;
    
    public HW(){
      btnGenerate = new JButton("Generate");
      btnGenerate.addActionListener(new GenerateListener());
      
      lblInput = new JLabel("Input");
      lblOutput = new JLabel("Output");
      
      TAinput = new JTextArea();
      
      TAoutput = new JTextArea();
      TAoutput.setEditable(false);
      
      pnlWest = new JPanel(new GridLayout(2,1));
      pnlCenter = new JPanel(new GridLayout(2,1));
      
      pnlWest.add(lblInput);
      pnlWest.add(lblOutput);
      
      pnlCenter.add(TAinput);
      pnlCenter.add(TAoutput);
      
      add(pnlWest, "West");
      add(pnlCenter, "Center");
      add(btnGenerate, "South");
    }
    
    public class GenerateListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
        btnGenerate = (JButton) ae.getSource();
        
        String input = TAinput.getText();
        String result = "";
        
        int x = 0;
        int y = 0;
        int z = 0;
        int n = 1;
        
        for(int i = 0; i < input.length(); i++){
            for(int j = 0; j < input.length()-z; j++){
                result +=  input.substring(x, y+n);
                if(j < input.length()-z){
                result += ", ";
                }
                x++;
                y++;
            }
            x = 0;
            y = 0;
            z++;
            n++;
        }
        TAoutput.setLineWrap(true);
        TAoutput.setText("[" + result + "]");
        }
    }
}    