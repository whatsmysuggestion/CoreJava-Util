import java.util.*;
public class IteratorExample {

	public static void main(String[] args) {
 
		LinkedList ll=new LinkedList();
		 ll.add("A");
		 ll.add("B");
		 ll.add("C");
		 ll.add("D");
		 ll.add("D");
		/*
		 * System.out.println(ll.get(1));
		 * 
		 * System.out.println(ll);
		 */
		 
		 String s=new String();
		 Iterator it=ll.iterator();
		 
		 while(it.hasNext())
		 {
			 s=(String)it.next();
			 
			 
			 if(s.equals("B"))
			 {	
				 it.remove();
				 s=(String)it.next();
			 }
			  
			 System.out.println(s);
		 }
		
		

	}

}
