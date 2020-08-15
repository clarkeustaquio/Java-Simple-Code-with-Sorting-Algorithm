import java.util.Scanner;
public class QueueRunner{
   public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     int choice = 0;
     LinkedListQueue myQueue = new LinkedListQueue();
     do{
       System.out.print("LinkedList as a Queue\n[1] Enqueue\n[2] Dequeue\n[3] View\n[4] Exit\nEnter choice: ");
       choice=sc.nextInt();
       switch(choice){
         case 1:
           System.out.print("Enter element: ");
           myQueue.enqueue(sc.next());
           break;
         case 2:
           try{
             System.out.println("Dequeued element: "+myQueue.dequeue());
           }
           catch(Exception e){
             System.out.println("Empty Queue!");
           }
           break;
         case 3:
           System.out.println("Queuecontents: "+myQueue.view());
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