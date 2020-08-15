import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListStack
{
    private LinkedList list = new LinkedList<String>();
    
    public void push(String element){
        list.add(element);
    }
    public Object pop(){
        return list.remove(list.size()-1);
    }
    
    public LinkedList<String> view(){
    Iterator decending = list.descendingIterator();
    LinkedList dec = new LinkedList<String>();
    
        while(decending.hasNext()){
            dec.add(decending.next());
        }
        return dec;
    }
    
}
