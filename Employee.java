
public class Employee implements Comparable<Employee> {
	   
	String name;  
	int salary;  
	
	Employee(String name,int salary){  
	this.name=name;  
	this.salary=salary;  
	}  
	  
	public int compareTo(Employee st){  
		
	if(salary==st.salary)  
	return 0;  
	else if(salary>st.salary)  
	return 1;  
	else  
	return -1;  
	
	}
	
	
}
