import java.util.*;  
    
public class Linkedlist{  
    
    public static void main(String args[])  
    {  
        LinkedList<String> ll = new LinkedList<>();  
        
        // Add the element in list.
        
        ll.add("Akash");  
        ll.add("Dinesh");  
        
        System.out.println(ll);  
        
        //Change the element in queue.
        ll.set(1, "Jadhav");
        
        //Iteration.
        for (int i = 0; i < ll.size(); i++) {  
    
            System.out.print(ll.get(i) + " ");  
        }  
        
        //Remove by index or value.
        ll.remove(1);
        ll.remove(Akash);
        
        
    }  
}  
/*
      Output 
      
      ["Akash", "Dinesh"]
      Akash Jadhav
      
      
*/
