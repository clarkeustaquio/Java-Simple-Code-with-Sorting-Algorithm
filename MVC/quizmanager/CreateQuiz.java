package quizmanager;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;

public class CreateQuiz extends JFrame
{
    JLabel quizID, quizDescription, question;
    JTextField txtfID, txtfDescription;
    JButton btnSave, btnCancel, btnAddQuestion;
    
    
    public CreateQuiz(){
        setLayout(new FlowLayout());
        quizID = new JLabel("Quiz ID: ");
        quizDescription = new JLabel("Quiz Description: ");
        question = new JLabel("Questions: ");
        
        txtfID = new JTextField(15);
        txtfDescription = new JTextField(15);
        
        btnSave = new JButton("Save");
        btnCancel = new JButton("Cancel");
        btnAddQuestion = new JButton("Add Questions");
        
        add(quizID);
        add(txtfID);
        add(quizDescription);
        add(txtfDescription);
        add(question);
        add(btnAddQuestion);
        
        add(btnSave);
        add(btnCancel);
        
        setSize(550, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public int getQuizID(){
        return Integer.parseInt(txtfID.getText());
    }
    
    public String getQuizDescription(){
        return txtfDescription.getText();
    }
    
    public void saveListener(ActionListener saveListener){
        btnSave.addActionListener(saveListener);
    }
    public void cancelListener(ActionListener cancelListener){
        btnCancel.addActionListener(cancelListener);
    }
    public void newQuestionListener(ActionListener questionListener){
        btnAddQuestion.addActionListener(questionListener);
    }
}
