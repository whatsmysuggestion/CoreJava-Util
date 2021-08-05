
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<String,String> hm=new ConcurrentHashMap<String,String>();
		hm.put("1", "A");
		hm.put("2", "B");
		hm.put("1", "z");
		hm.put("3", "C");
		hm.putIfAbsent("4","Z");
		hm.replace("1","z","X");
		//hm.remove("2","B");
		
		  System.out.println(hm); 
		  System.out.println(hm.get("1"));
		  System.out.println(hm.keySet()); 
		  System.out.println(hm.values());
		 
		
		/*
		 * Set<Map.Entry<String,String>> data=hm.entrySet();
		 * 
		 * for(Map.Entry<String,String> me:data) {
		 * System.out.println(me.getKey()+"=="+me.getValue()); }
		 */
		 
		
		

	}

}
