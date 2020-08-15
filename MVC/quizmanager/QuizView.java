package quizmanager;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.Font;

public class QuizView extends JFrame
{
    JButton createQuiz, showQuizQuestion;
    JTextArea textArea;
    JScrollPane scrollPane;
    
    public QuizView(){
        setLayout(new FlowLayout());
        textArea = new JTextArea(10, 50);
        scrollPane = new JScrollPane(textArea);
        createQuiz = new JButton("Create Quiz");
        showQuizQuestion = new JButton("Display Questions");
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        add(scrollPane);
        add(createQuiz);
        add(showQuizQuestion);
        
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void setList(String listValue){
        textArea.setText(listValue);
        textArea.setFont(new Font("Serif",Font.PLAIN,15));  
    }
    
    public void createListener(ActionListener createQuizListener){
        createQuiz.addActionListener(createQuizListener);
    }
    public void displayQuestionListener(ActionListener displayListener){
        showQuizQuestion.addActionListener(displayListener);
    }
}
