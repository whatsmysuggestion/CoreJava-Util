import java.util.*;
public class StringTokenizerExample {

	public static void main(String[] args) {
		
		StringTokenizer st=new StringTokenizer("H:E;L-L:O",":;-,");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	 

	}

}
