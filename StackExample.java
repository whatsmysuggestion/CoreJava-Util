import java.util.*;
public class StackExample {

	public static void main(String[] args) {
 
		Stack st=new Stack();
		
		st.push("A");
		st.push("B");
		st.push("C");
		st.push(new Integer(10));
		st.push(new Integer(11));
		
		System.out.println(st);
		
		
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());
		 
		
	 	
		

	}

}
