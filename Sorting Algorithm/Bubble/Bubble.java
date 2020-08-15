import java.util.Scanner;
import java.util.Random;
public class Bubble{
    
    public static int[] Bubble(int[] list){
        for(int i = 0; i < list.length-1; i++){
            for(int j = 0; j < (list.length-1)-i; j++){
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }
    
    public static int ThirdMax(int[] list){
        if(list.length >= 3)
            return list[list.length-3];
        else
            return list[list.length-1];
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] list = new int[rand.nextInt(10)+1];
        for(int i = 0; i < list.length; i++){
            list[i] = rand.nextInt(100)+20;
        }
        System.out.print("Unsorted: ");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
        int[] sorted = Bubble(list);
        System.out.print("Sorted: ");
        for(int i = 0; i < list.length; i++){
            System.out.print(sorted[i] + " ");
        }
        System.out.println();
        System.out.print("Third Max: " + ThirdMax(sorted));
    }
}