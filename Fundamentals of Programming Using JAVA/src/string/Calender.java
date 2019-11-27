package string;
import java.util.Calendar;
public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		System.out.println("At present calendar's year : "+calendar.get(calendar.YEAR));
		System.out.println("At present calendar's date : "+calendar.get(calendar.DATE));
		
		System.out.println("The current date is:\n"+calendar.getTime());
		calendar.add(Calendar.DATE, -7);
		System.out.println("7 Days ago:\n"+calendar.getTime());
	

	}

}
