import java.util.*; 
  
class TreeSetExample { 
  
    public static void main(String[] args) 
    { 
        TreeSet<String> ts1 = new TreeSet<String>(); 
  
        // Elements are added using add() method 
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C"); 
  
        // Duplicates will not get insert 
        ts1.add("C"); 
  
        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println(ts1); 
        
        //Display the element
        System.out.println("Contains" + ts.contains("A"))
        System.out.println("First Value " + ts.first()); 
        System.out.println("Last Value " + ts.last());
        /*for int only... System.out.println("Higher " + ts.higher(val)); 
        System.out.println("Lower " + ts.lower(val)); */
        
        //Remove the elements
        ts.remove("A");
        
        //Iterating the value.
        for (String value : ts) 
            System.out.print(value+","); 
        
    } 
} 

/*
      Output :
      
      [A, B, C]
      Contains true
      A
      C

*/
/*
        TreeSet implements the SortedSet interface. So, duplicate values are not allowed.
*/
