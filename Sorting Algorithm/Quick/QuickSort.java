
/**
 * Write a description of class QuickSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickSort
{
    public static int[] quickSort(int[] array){
        return quickDivide(array, 0, array.length-1);
    }
    public static int[] quickDivide(int[] array, int start, int end){
        int pivot = array[(start + end)/2];
        int left = start, right = end;
        while(left <= right){
            while(array[left] < pivot)
                left++;
            while(array[right] > pivot)
                right--;
                
            if(left <= right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        if(start <= right)
            array = quickDivide(array, start, right);
        if(left <= end)
            array = quickDivide(array, left, end);
        
        return array;
    }
    public static void main(String[] args){
        int[] arrayList = {154, 112, 182, 106, 165, 58, 183, 211, 232, 233, 140, 163};
        System.out.print("UnSorted: ");
        for(int i = 0; i < arrayList.length; i++){
            System.out.print(arrayList[i] + " ");
        }
        System.out.println();
        System.out.print("Sorted: ");
        long start = System.currentTimeMillis();
        //int[] sortedList = mergeSort(arrayList);
        int[] sortedList = quickSort(arrayList);
        for(int i = 0; i < sortedList.length; i++){
            System.out.print(sortedList[i] + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Elapsed Time: " + (start-end));
    }
}
