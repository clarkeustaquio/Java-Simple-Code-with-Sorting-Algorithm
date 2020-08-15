package quizmanager;

import java.util.ArrayList;

public class Quiz {
    private int ID;
    private String description;
    private ArrayList<Question> listOfQuestions = new ArrayList<>();
    
    public Quiz(){
        super();
    }
    
    public Quiz(ArrayList<Question> listOfQuestions){
    }
    
    public Quiz(int ID, String description, ArrayList<Question> listOfQuestions){
        this.ID = ID;
        this.description = description;
        this.listOfQuestions.addAll(listOfQuestions);
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    
    public void setQuestions(ArrayList<Question> listOfQuestions){
        ViewQuestion viewQuestion = new ViewQuestion();
        this.listOfQuestions = listOfQuestions;
        String show = "[List Of Questions: " + listOfQuestions.toString() + "]\n";
        viewQuestion.setView(show);
    }
    
    public ArrayList<Question> getQuestions(){
        return listOfQuestions;
    }
    
    public String toString(){
        return String.format("[Quiz ID: %s][Quiz Description: %s]", ID, description);
        //return String.format("[ID: %s][Description: %s][List Of Questions: %s]\n", ID, description, listOfQuestions.toString());
    }
    
}
