
/**
 * Write a description of class MergeSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSort
{
    public static int[] mergeSort(int[] arrayList){
        return divideArray(arrayList, 0, arrayList.length-1);
    }
    public static int[] divideArray(int[] arrayList, int start, int end){
        if(start == end)
            return arrayList;
        
        int mid = (start+end) / 2;
        
        arrayList = divideArray(arrayList, start, mid);
        arrayList = divideArray(arrayList, mid + 1, end);
        arrayList = combineArray(arrayList, start, mid, end);
        
        return arrayList;
    }
    
    public static int[] combineArray(int[] arrayList, int start, int mid, int end){
        int left = start, right = mid+1, pointer = start;
        int[] temp = new int[arrayList.length];
        
        for(int i = 0; i < temp.length; i++){
            temp[i] = arrayList[i];
        }
        
        while(left <= mid && right <= end){
            if(temp[left] < temp[right]){
                arrayList[pointer] = temp[left];
                left++;
            }else{
                arrayList[pointer] = temp[right];
                right++;
            }
            pointer++;
        }
        while(left <= mid){
            arrayList[pointer] = temp[left];
            left++;
            pointer++;
        }
        
        
        
        return arrayList;
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
        int[] sortedList = mergeSort(arrayList);

        for(int i = 0; i < sortedList.length; i++){
            System.out.print(sortedList[i] + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Elapsed Time: " + (start-end));
    }
}
