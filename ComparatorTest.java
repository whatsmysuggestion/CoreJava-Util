import java.util.*;  
public class ComparatorTest{  	
public static void main(String args[]){    
ArrayList al=new ArrayList();  
al.add(new Employee1("Vijay",23));  
al.add(new Employee1("Ajay",27));  
al.add(new Employee1("Jai",21));    
  
Collections.sort(al,new SalaryComparator());  

Iterator itr2=al.iterator();  

while(itr2.hasNext()){  
	Employee1 ee=(Employee1)itr2.next();  
System.out.println(ee.name+" "+ee.salary);  
}    
}  
}  