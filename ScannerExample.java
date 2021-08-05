import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args)throws Exception {

		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("My name is "+name);
		
		System.out.println("Enter 2 values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Result Is  "+c);
		sc.close();

	}

}
