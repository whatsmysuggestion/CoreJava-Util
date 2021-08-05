import java.util.*;

public class ArrayListHW {

	public static void main(String[] args) {
		ArrayList <String>al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("A");

		int count=0;
		for(String s:al)
		{
			
			if(s.equals("A"))
				count++;
		}
		System.out.println("Character A Available   "+count+" Times");
		

	}

}
