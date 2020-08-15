import java.util.Scanner;

class FilePath{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Filename: ");
        String file = sc.nextLine();

        int index = file.lastIndexOf('\\');
        int ex = file.lastIndexOf('.');
        int path = file.indexOf('\\');
        //C:\Users\User1\Videos\Naruto\ep 1.mp4
        int counter = 0;

        System.out.println("File Properties");  

        for(int i = 0; i < file.length(); i++){
            if((file.charAt(i)) == '.' ){
                counter++;
            }
        }

        try{
            if(counter > 0){
                System.out.println("Name: " + file.substring(index+1, ex));
                System.out.println("Extension: " + file.substring(ex+1));
            }else{
                System.out.println("Name: " + file.substring(index+1));
                System.out.println("Extension: None" );
            }

            System.out.println("Path: " + file.substring(path+1, index));
            System.out.println("Drive: "+ file.charAt(0));
        }catch(Exception e){
            System.out.println("Invalid File Path");
        }
    }
}
