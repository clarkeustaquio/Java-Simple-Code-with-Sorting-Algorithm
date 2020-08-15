import java.util.Scanner;
import java.lang.String.*;

class Paragraph{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Paragraph: ");
        String input = sc.nextLine();
        int let = 0, dig = 0, white = 0, sym = 0;
        
        for(int i = 0; i < input.length(); i++){
            if(Character.isLetter(input.charAt(i))){
                let++;
            }else if(Character.isDigit(input.charAt(i))){
                dig++;
            }else if(Character.isWhitespace(input.charAt(i))){
                white++;
            }else if(!Character.isLetterOrDigit(i)){
                sym++;
            }
        }
        
        System.out.println("Statistics");
        System.out.println("Letters: " + let);
        System.out.println("Digit: " + dig);
        System.out.println("Whitespaces: " + white);
        System.out.println("Symbols: " + sym);
        
    }
}