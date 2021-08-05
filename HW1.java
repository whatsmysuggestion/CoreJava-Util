import java.io.*;
import java.util.*;
public class HW1 
{
	
	public static void main(String[] args)throws Exception
	{
		FileReader fr=new FileReader("E:\\dummy\\demo.txt");
		BufferedReader br=new BufferedReader(fr);		
		TreeSet tr=new TreeSet();
		
		String lineData=new String();		
		
		
		FileWriter fw=new FileWriter("E:\\dummy\\sajib2.txt");
		BufferedWriter bw=new BufferedWriter(fw);		
		
		while((lineData=br.readLine())!=null)
		{
			
			String lineArr[]=lineData.split(" ");
			for(int i=0;i<lineArr.length;i++)
			{
				tr.add(lineArr[i].toLowerCase());
			}
						
			
		}	
		Iterator itt=tr.iterator();
		String word=new String();
		while(itt.hasNext())
			
		{
			word=(String)itt.next();
			
			bw.write(word);
			bw.newLine();
		}
		
		
		bw.close();	
		
		
	}

}
