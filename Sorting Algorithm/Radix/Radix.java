import java.util.ArrayList;
import java.util.Random;

public class Radix
{
    public static int[] radixSort(int[] arrayList){
        ArrayList<ArrayList<Integer>> theBucket = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < 10; i++){
            theBucket.add(new ArrayList<Integer>());
        }
        
        int max = arrayList[0];
        for(int i = 0; i < arrayList.length; i++){
            if(max < arrayList[i])
                max = arrayList[i];
        }
        int passCount = 0;
        
        while(max > 0){
            passCount++;
            max /= 10;
        }
        
        for(int i = 0; i < passCount; i++){
            for(int j = 0; j < arrayList.length; j++){
                int index = arrayList[j] / (int) Math.pow(10, i) % 10;
                theBucket.get(index).add(arrayList[j]);
            }   
            System.out.println("Pass: " + (i+1));
            for(int k = 0; k < theBucket.size(); k++){
                System.out.println(theBucket.get(k));
            }
            
            
            int pointer = 0;
            for(ArrayList<Integer> theValue: theBucket){
                while(theValue.size() > 0){
                    arrayList[pointer] = theValue.remove(0);
                    pointer++;
                }
            }
        }
        
        return arrayList;
    }
    
    public static void main(String[] args){
        Random rand = new Random();
        int[] arrayList = {158, 198, 35, 29, 50, 200, 36, 1, 4, 79}; //{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        ArrayList<ArrayList<Integer>> theBucket = new ArrayList<ArrayList<Integer>>();

        long timeStart = System.currentTimeMillis();
        
        int[] sortedList = radixSort(arrayList);
        
        long endStart = System.currentTimeMillis();
        System.out.print("Sorted: ");
        for(int i = 0; i < sortedList.length; i++){
            System.out.print(sortedList[i] + " ");
        }
        System.out.println();
        System.out.print("Elapsed Time: " + (timeStart-endStart));
        
    }
    
}
