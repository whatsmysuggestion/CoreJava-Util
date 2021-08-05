import java.util.*;
public class HashTableExample {

	public static void main(String[] args) {

		Hashtable ht=new Hashtable();
		ht.put("1", "A");
		ht.put("2", "B");
		ht.put("3", "C");
		ht.put("4", "D");
		ht.put("5", "E");
	    ht.put("1", "F");
	 //  ht.put(null,"8");
	    System.out.println(ht); 
		
	    
		  
		/*
		 * Enumeration e=ht.keys(); while(e.hasMoreElements()) {
		 * System.out.println(e.nextElement());
		 * 
		 * }
		 * 
		 * 
		 */
		
		  
		
		
		
		
		  System.out.println("-----------------------------------");
		  
		  Enumeration e1=ht.elements(); 
		  while(e1.hasMoreElements()) 
		  {
		  System.out.println(e1.nextElement());
		  }
		  
		  
		  
		 
	}

}
