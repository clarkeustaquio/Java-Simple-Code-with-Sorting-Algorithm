import java.util.Scanner;

class Mobile_Phone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do{
            System.out.println("\tMy Phone\n1. Call\n2. Text\n3. Change Call Rate\n" +
                "4. Change Text Rate\n5. Reload\n6. Check Balance\n7. Exit");

            System.out.print("Enter Choice: ");
            input = sc.nextInt(); 
            
            Phone_Object MyObject = new Phone_Object();
            
            
            switch(input){
                case 1:
                System.out.print("Enter Promo Call(mins): ");   
                int minutes = sc.nextInt();  

                if(MyObject.call(minutes)){
                    System.out.println("Successfully Claimed the Promo!");
                }else{
                    System.out.println("You don't have enough load");
                }

                break;
                
                case 2:
                if(MyObject.getLoad() <= 0){
                    System.out.println("Your Current Balance is: " + MyObject.getLoad());
                    System.out.println("\tPlease Re-load!");
                }else{
                    sc.nextLine(); //Consume New Line; Avoid MismatchException
                    System.out.println("Enter your Message: ");
                    String message = sc.nextLine();
                    int length = 0;
                    
                    for(int i = 0; i < message.length(); i++){
                        length++;
                    }
                    
                    if(MyObject.text(length)){
                        System.out.println("Successfully Send");
                    }else
                        System.out.println("Characters has Exceeded");

                }
                break;

                case 3:
                    System.out.println("Current Call Rate = " + MyObject.getCallRate());
                    System.out.print("Change Call Rate: ");
                    double call_rate = sc.nextDouble();
                    if(call_rate != 0){
                    MyObject.Phone_Object(call_rate);
                    System.out.println("New Call Rate = " + MyObject.getCallRate());
                    }else
                        System.out.println("Not Free!");
                    break;

                case 4:
                    System.out.println("Current Text Rate = " + MyObject.getTextRate());
                    System.out.print("Change Text Rate: ");
                    int text_rate = sc.nextInt();
                    if(text_rate != 0){
                    MyObject.Phone_Object(text_rate);
                    System.out.println("New Text Rate = " + MyObject.getTextRate());
                    }else
                        System.out.println("Not Free!");
                break;
                case 5:
                    System.out.print("Enter Amount to Reload: ");
                    double amount = sc.nextDouble();
                    if(MyObject.reload(amount)){
                        System.out.println("Your Balance:  " + MyObject.getLoad());
                    }else{
                        System.out.println("Invalid!");
                }
                break;
                case 6:
                    System.out.println("Your Balance: " + MyObject.getLoad());
                    break;
                case 7:
                    System.out.print("Program Terminated!");
                break;
                default:
                    System.out.println("Invalid Input");
            }
        }while(input != 7);
    }
}