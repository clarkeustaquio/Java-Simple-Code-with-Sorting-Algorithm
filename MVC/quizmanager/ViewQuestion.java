package quizmanager;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ViewQuestion extends JFrame
{
    JTextArea textArea;
    JComboBox dropDown, hiddenList;
    JButton btnBack;
    public int quizID;
    public String combine;
    
    public ViewQuestion(){
        setLayout(new FlowLayout());
        textArea = new JTextArea(26, 50);
        dropDown = new JComboBox();
        btnBack = new JButton("Back");
        add(dropDown);
        add(textArea);
        add(btnBack);
        
        setSize(600, 600);
    }
    public void addItem(int quizID, String description){
        this.quizID = quizID;
        this.combine = "[Quiz ID: " + quizID + "][Quiz Description: " + description + "]";
        dropDown.addItem(combine);
    }
    
    public int getQuizID(){
        return quizID;
    }
    
    public void setView(String setView){
        this.textArea.setText(setView);
        this.textArea.setFont(new Font("Serif",Font.PLAIN,15)); 
    }
    
    public void viewBackButtonListener(ActionListener viewListener){
        btnBack.addActionListener(viewListener);
    }
    
    public void dropDownItemListener(ItemListener dropDownListener){
        dropDown.addItemListener(dropDownListener);
    }
    
}
