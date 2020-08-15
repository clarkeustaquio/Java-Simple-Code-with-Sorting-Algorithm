import java.util.LinkedList;

public class LinkedListQueue
{
   private LinkedList list = new LinkedList<String>();
   
   public void enqueue(String element){
       list.add(element);
   }
   public Object dequeue(){
       return list.remove(0);
   }
   public LinkedList<String> view(){
       return list;
    }
}
