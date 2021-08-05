
import java.util.*;
public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
		hm.put("1", "A");
		hm.put("2", "B");
		hm.put("1", "z");
		hm.put("3", "C");
		hm.put(null,"P");
		
		System.out.println(hm);
		System.out.println(hm.get("1"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
	
		
		
		
		


		

	}

}
