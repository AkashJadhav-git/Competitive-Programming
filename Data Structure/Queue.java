import java.util.LinkedList; 
import java.util.Queue; 
  
public class QueueExample { 
  
    public static void main(String[] args) 
    { 
        Queue<Integer> q = new LinkedList<>(); 
        
        for (int i = 0; i < 5; i++) 
            q.add(i); 
 
        System.out.println("Elements of queue "+ q); 
        
        int removedele = q.remove(); 
        System.out.println("removed element-"+ removedele); 
  
        System.out.println(q); 
        
        int head = q.peek(); 
        System.out.println("head of queue-"+ head); 
  
        int size = q.size(); 
        System.out.println("Size of queue-"+ size); 
        
    } 
} 
/*
    Output :
    
    Elements of queue [0, 1, 2, 3, 4]
    removed element-0
    [1, 2, 3, 4]
    head of queue-1
    Size of queue-4
*/
/*

    Create Queue   :    Queue<Integer> q = new LinkedList<>();
    Push elements  :    q.add(i)
    Remove element :    q.remove()
    Head of queue  :    q.peek()
    Size of queue  :    q.size()
    
    Iteration on Queue :
    
    Iterator iterator = pq.iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.print(iterator.next() + " "); 
        } 


*/
