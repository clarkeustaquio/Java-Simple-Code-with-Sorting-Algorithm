import java.util.Scanner;
import java.util.ArrayList;

public class LetterOccurrence
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] list = {'A', 'B', 'C', 'D', 'E', 'F','G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        ArrayList<String> array = new ArrayList<String>();
        
        System.out.print("Enter String: ");
        String string = sc.nextLine().toUpperCase();
        
        for(int i = 0; i < list.length; i++){
            int count = 0;
            for(int j = 0; j < string.length(); j++){
                if(list[i] == string.charAt(j)){
                    count++;
                }
                if((j == string.length()-1) && count != 0){
                    array.add(list[i] + " : " + count);
                }
            }
        }
        
        for(String alpha : array){
            System.out.println(alpha);
        }
    }
}
