package Review;


/**
 * Write a description of class Matrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matrix
{
    public static void main(String[] args){
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        //1 2 3 /1 2 3
        //4 5 6 /1 2 3
        //7 8 9 /1 2 3
        int[][] arr2 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] arr3 = new int[arr1.length][arr2.length];
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                int sum = 0;
                for(int k = 0; k < arr3.length; k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                arr3[i][j] = sum;
            }
        }
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
