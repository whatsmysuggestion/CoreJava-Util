import java.util.*;


public class StackExample2 {

	public static void main(String[] args) {
	Stack<String> st=new Stack<>();
		
		st.push("A");
		st.push("B");
		st.push("C");
	 
 
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());

	}

}
