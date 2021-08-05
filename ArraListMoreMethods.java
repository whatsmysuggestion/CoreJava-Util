import java.util.ArrayList;
public class ArraListMoreMethods {

	public static void main(String[] args) {
	 
		ArrayList<String>  al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("A");
		//al.add(5);
			
		/*
		 * System.out.println(al.indexOf("A")); System.out.println(al.lastIndexOf("A"));
		 * System.out.println(al);
		 * 
		 * 
		 */
		
		
		/*
		 * Object s[]=al.toArray(); for(int i=0;i<s.length;i++)
		 * System.out.println(s[i]);
		 * 
		 * 
		 * 
		 * 
		 */
		  
		
		
		  for (String temp : al) {
		  
		  System.out.println(temp); }
		 
		  
		 
		 
		 

	}

}
