package quizmanager;
import java.util.ArrayList;

public class Question {
    private int ID;
    private String text;
    private String correctAnswers;
    
    public Question(){
        super();
    }
     
    public Question(int ID, String text, String correctAnswers){
        this.ID = ID;
        this.text = text;
        this.correctAnswers = correctAnswers;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    
    public void setAnswers(String correctAnswers){
        this.correctAnswers = correctAnswers;
    }
    public String getAnswers(){
        return correctAnswers;
    }   

    public String toString(){
        return String.format("[ID: %s][Question: %s][Answer: %s]\n", ID, text, correctAnswers);
    }
}
