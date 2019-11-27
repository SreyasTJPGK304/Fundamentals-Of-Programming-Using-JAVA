package string;
import java.time.*;
public class Datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Current Date");
		LocalDate date=LocalDate.now(); //create an object to take the current date
		System.out.println(date);//display current date
		
		System.out.println("Current Time");
		LocalTime time=LocalTime.now();//create an object to take current time
		System.out.println(time);//displat current time
		
		System.out.println("Current Date and Time");
		LocalDateTime dt=LocalDateTime.now();//create an object to current date and time
		System.out.println(dt);//display current date and time
		

	}

}
