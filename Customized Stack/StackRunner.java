import java.util.Scanner;
public class StackRunner{
   public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     int choice = 0;
     LinkedListStack myStack = new LinkedListStack();
     do{
       System.out.print("LinkedList as a Stack\n[1] Push\n[2] Pop\n[3] View\n[4] Exit\nEnter choice: ");
       choice=sc.nextInt();
       switch(choice){
         case 1:
           System.out.print("Enter element: ");
           myStack.push(sc.next());
           break;
         case 2:
           try{
             System.out.println("Popped element: "+myStack.pop());
           }
           catch(Exception e){
             System.out.println("Empty Stack!");
           }
           break;
         case 3:
           System.out.println("Stack contents: "+myStack.view());
           break;
         case 4:
           System.out.println("Program Terminated");
           break;
         default: System.out.println("Invalid Choice");
       }
     }
     while(choice!=4);
   }
}