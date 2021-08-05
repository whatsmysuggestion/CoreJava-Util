import java.util.*;
public class ListIteratorExample {

	public static void main(String[] args) {

		 LinkedList ll=new LinkedList();
		 ll.add("A");
		 ll.add("B");
		 ll.add("C");
		 ll.add("D");
		 ll.add("D");
		 System.out.println(ll);
		 
		 System.out.println("<---------------------------------------->");
		 ListIterator it=ll.listIterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 System.out.println("<---------------------------------------->");
 		 while(it.hasPrevious())
		 {
			 System.out.println(it.previous());
		 }
		

	}

}
