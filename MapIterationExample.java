import java.util.*;
public class MapIterationExample {

	public static void main(String[] args) {
		 
		HashMap hm=new HashMap();
		
		hm.put("1", "A");
		hm.put("2", "B");
		hm.put("3", "C");
		hm.put("3", "D");
		System.out.println(hm);
	  
		
		  
		
		/*
		 * Iterator itt=hm.keySet().iterator();
		 * 
		 * String s=new String();
		 * 
		 * while(itt.hasNext()) { s=(String)itt.next();
		 * System.out.println(s+" "+hm.get(s)); }
		 * 
		 * System.out.println("----------------------------------");
		 * 
		 */
		
		  
		/*
		 * Iterator it1=hm.values().iterator();
		 * 
		 * while(it1.hasNext()) {
		 * 
		 * System.out.println(it1.next());
		 * 
		 * }
		 * 
		 * 
		 */
			
		
		
		  Set<Map.Entry<String,String>> me=hm.entrySet();
		  
		  for(Map.Entry<String,String> it:me) {
		  System.out.println(it.getKey()+"........"+it.getValue()); }
		  
		 
		 
		 
		 
		
	}

}
