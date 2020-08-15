package quizmanager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class QuizController
{
    ArrayList<Question> listOfQuestions = new ArrayList<>();
    ArrayList<Quiz> listOfQuiz = new ArrayList<>();
    
    //--------------------------
    ViewQuestion viewQuestion;
    
    Question question;
    Quiz quiz;
    QuizView quizView;
    CreateQuiz createQuiz;
    QuestionCreation questionCreation;
    
    public QuizController(Question question, Quiz quiz, QuizView quizView, CreateQuiz createQuiz, QuestionCreation questionCreation, ViewQuestion viewQuestion){
        this.question = question;
        this.quiz = quiz;
        
        this.quizView = quizView;
        this.viewQuestion = viewQuestion;
        this.createQuiz = createQuiz;
        this.questionCreation = questionCreation;

        this.quizView.createListener(new QuizCreateListener());
        this.quizView.displayQuestionListener(new ViewListener());
        
        this.createQuiz.saveListener(new SaveListener());
        this.createQuiz.cancelListener(new CancelListener());
        this.createQuiz.newQuestionListener(new QuestionListener());
        this.questionCreation.addButtonListener(new AddListener());
        this.questionCreation.backListener(new BackListener());
        
        this.viewQuestion.viewBackButtonListener(new ViewBackListener());
        this.viewQuestion.dropDownItemListener(new DropDownItemListener());
    }
    
    class QuizCreateListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            createQuiz.setVisible(true);
            quizView.dispose();
        }
    }
    class ViewListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            viewQuestion.setVisible(true);
        }
    }
    
    class SaveListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int ID = createQuiz.getQuizID();
            String description = createQuiz.getQuizDescription();
            
            listOfQuiz.add(new Quiz(ID, description, listOfQuestions));
            
            quizView.setList(listOfQuiz.toString());
            
            viewQuestion.addItem(ID, description);
            
            quizView.setVisible(true);
            createQuiz.dispose();
        }
    }
    class CancelListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            quizView.setVisible(true);
            createQuiz.dispose();
        }
    }
    class QuestionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            questionCreation.setVisible(true);
            createQuiz.dispose();
        }
    }
    class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int qNumber = questionCreation.getQNumber();
            String question = questionCreation.getQuestion();
            String correctAnswer = questionCreation.getAnswer();
            listOfQuestions.add(new Question(qNumber, question, correctAnswer));
            
            JOptionPane.showMessageDialog(null, "Successfully Added!");
        }
    }
    class BackListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            createQuiz.setVisible(true);
            questionCreation.dispose();
        }
    }
    class ViewBackListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            viewQuestion.dispose();
        }
    }
    class DropDownItemListener implements ItemListener{
        public void itemStateChanged(ItemEvent ae){
            int getSource = viewQuestion.dropDown.getSelectedIndex();
        }
    }
}
