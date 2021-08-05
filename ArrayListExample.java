import java.util.*;
 
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList  al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		al.add(new Integer(10));  
		al.add("10");
	    al.add(56);  
	    System.out.println(al);
		
		
		/*
		 * System.out.println(al.size()); System.out.println(al.contains("C"));
		 * System.out.println(al.remove(1)); System.out.println(al);
		 * //al.ensureCapacity(10); //System.out.println(al.size());
		 * 
		 */
		 
		
		
		
		  Iterator it=al.iterator(); 
		  
		  Object s;
		  
		  while(it.hasNext()) {
			  
			  s=it.next();
		  
		  if(s.equals("B")) 
		  { 
			  it.remove();
			  s=it.next();
		  }
		  
		  System.out.println(s); }
		 
		 

	}

}
