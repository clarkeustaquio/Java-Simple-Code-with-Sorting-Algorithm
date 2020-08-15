package quizmanager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;

public class QuestionCreation extends JFrame
{
    JLabel lblquestionNumber, lblquestion, lblcorrectAnswer;
    JTextField txtfQNumber, txtfQQuestion, txtfQAnswer;
    JButton btnAdd, btnBack;
    
    public QuestionCreation(){
        setLayout(new FlowLayout());
        lblquestionNumber = new JLabel("Question Number: ");
        lblquestion = new JLabel("Question: ");
        lblcorrectAnswer = new JLabel("Correct Answer: ");
        
        txtfQNumber = new JTextField(15);
        txtfQQuestion = new JTextField(15);
        txtfQAnswer = new JTextField(15);
        
        btnAdd = new JButton("Add");
        btnBack = new JButton("Back");
        
        add(lblquestionNumber);
        add(txtfQNumber);
        add(lblquestion);
        add(txtfQQuestion);
        add(lblcorrectAnswer);
        add(txtfQAnswer);
        
        add(btnAdd);
        add(btnBack);
        
        setSize(550, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public int getQNumber(){
        return Integer.parseInt(txtfQNumber.getText());
    }
    public String getQuestion(){
        return txtfQQuestion.getText();
    }
    public String getAnswer(){
        return txtfQAnswer.getText();
    }
    
    public void addButtonListener(ActionListener addButton){
        btnAdd.addActionListener(addButton);
    }
    public void backListener(ActionListener backListener){
        btnBack.addActionListener(backListener);
    }
    
    
}
