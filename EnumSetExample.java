import java.util.*;


public class EnumSetExample {
	
	enum days {  
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
		}  
	
	
	public static void main(String[] args) {
		EnumSet<days> set = EnumSet.of(days.FRIDAY,days.TUESDAY, days.WEDNESDAY);  
		 
		 System.out.println(set);

	}

}
