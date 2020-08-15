public class Insertion
{
    public static void main(String[] args){
        //int[] array = {484, 13, 237, 689, 698, 35, 274, 635};
        int[] array = {98, 26, -19, 0, 86, -43, 69, -39};
        for(int i = 1; i < array.length; i++){
            int value = array[i];
            int hole = i;
            
        if(hole > 0 && array[hole-1] > value){
            while(hole > 0 && array[hole-1] > value){
                System.out.print(array[hole-1] + " > " + value + " : ");
          
                    array[hole] = array[hole-1];
                    hole = hole-1;
                    
                    for(int z = 0; z < array.length; z++){
                        System.out.print(array[z] + " ");
                    }
                    System.out.println();
  
                
            }
        }else{
            System.out.println(array[hole-1] + " > " + value + " : False");
        }
            
            array[hole] = value;
            System.out.print("Pass: " + i + " --- ");
            for(int j = 0; j < array.length; j++){
                System.out.print(array[j] + " ");
            }
            System.out.println();
            System.out.println("-------------------");
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        
    }
}
