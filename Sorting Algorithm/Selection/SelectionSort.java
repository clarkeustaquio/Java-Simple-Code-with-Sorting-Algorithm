public class SelectionSort
{
    public static void main(String[] args){
        //int[] array = {484, 13, 237, 689, 698, 35, 274, 635};
        int[] array = {98, 26, -19, 0, 86, -43, 69, -39};
        for(int i = 0; i < array.length-1; i++){
            int minimum = i;
            for(int j = i+1; j < array.length; j++){
                
                if(array[j] < array[minimum]){
                    System.out.print(array[j] + " < " + array[minimum] + " : ");
                    minimum = j;
                  
                        System.out.print("Minimum: " + array[minimum]);
                    
                    System.out.println();
                }else
                    System.out.println(array[j] + " < " + array[minimum] +" : False");
            }
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
            System.out.print("Pass: " + (i+1) + " --- ");
            for(int k = 0; k < array.length; k++){
                System.out.print(array[k] + " ");
            }
            System.out.println();
            System.out.println("--------------------");
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
