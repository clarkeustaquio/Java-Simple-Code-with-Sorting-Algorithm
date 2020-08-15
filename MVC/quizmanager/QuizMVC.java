package quizmanager;

import java.util.ArrayList;

public class QuizMVC
{
    public static void main(String[] args){
        
        Question questionModel = new Question();
        Quiz quizModel = new Quiz();
        
        CreateQuiz createView = new CreateQuiz();
        QuizView quizView = new QuizView();
        QuestionCreation questionView = new QuestionCreation();
        ViewQuestion viewQuestion = new ViewQuestion();
        QuizController controller = new QuizController(questionModel, quizModel, quizView, createView, questionView, viewQuestion);
        
        quizView.setVisible(true);
    }
}
