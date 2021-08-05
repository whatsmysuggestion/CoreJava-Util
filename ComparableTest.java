import java.util.*;  
public class ComparableTest{  
public static void main(String args[]){ 
	
ArrayList<Employee> al=new ArrayList<Employee>();  

al.add(new Employee("Vijay",23));  
al.add(new Employee("Ajay",27));  
al.add(new Employee("Jai",21));  
al.add(new Employee("Ajay1",24));  
al.add(new Employee("Jai2",20));  
  
Collections.sort(al); 

for(Employee emp:al){  
System.out.println(emp.name+" "+emp.salary);  
}  
}  
}  