import java.util.*;
import java.util.AbstractSequentialList;
import java.util.AbstractList;
import java.util.AbstractCollection;
public class LinkedListExample {
	public static void main(String[] args) {
		
			 LinkedList<String> ll=new LinkedList<>();
			 ll.add("C");
			 ll.add("D");
			 ll.add("B");
			 ll.add("D");
			 ll.add("A");		
			
		
		  System.out.println(ll);
		  
		  ll.addFirst("A1"); 
		  ll.addLast("Z1");
		  System.out.println(ll);

		  System.out.println(ll.removeLast()); 
		  System.out.println(ll.removeFirst());
		  System.out.println(ll); 
		  ll.add(1,"M");
		  System.out.println(ll);
		
		  	Collections.sort(ll);
		  	System.out.println(ll);
		    Collections.reverse(ll);
		    System.out.println(ll);
		  
		 
		   System.out.println(ll.contains("C"));
		 
		 
		 
		 
		 
		
		 
		 
		 
	}

}
