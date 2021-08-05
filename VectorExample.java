import java.util.*;

public class VectorExample {

	public static void main(String[] args) {

		Vector ve = new Vector(10);

		ve.addElement("A");
		ve.addElement("B");
		ve.addElement("C");
		ve.addElement("D");
		ve.addElement("B");
		ve.addElement("F");
		ve.addElement("G");
		ve.addElement("H");
		ve.addElement("H");
		ve.addElement("H");
		ve.addElement("H");
		ve.addElement(new Integer(10));
			
		
		
		/*
		 * System.out.println(ve); System.out.println(ve.size());
		 * System.out.println(ve.capacity());
		 */
		
		  
		
		/*
		 * ArrayList al=new ArrayList(); al.add("B"); al.add("G");
		 * 
		 * System.out.println(ve.removeAll(al));
		 * 
		 */
		/*
		 * System.out.println(ve.get(2));
		 * 
		 * System.out.println(ve);
		 */
		 
		 
		 
		 
		 
		  
		 // System.out.println(ve.capacity());
		 
		
		
		/*
		 * ve.remove("H");
		 * 
		 * 
		 * System.out.println(ve);
		 * 
		 * 
		 * ve.clear(); System.out.println(ve);
		 * 
		 * 
		 */
		
		  
		  
		  
		
		  Enumeration e=ve.elements();
		  
		  while(e.hasMoreElements())
		  { 
			  System.out.println(e.nextElement()); 
		  }
		 
		  
		  
		 
		 
	}

}
