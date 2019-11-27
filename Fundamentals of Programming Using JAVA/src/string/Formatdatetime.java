package string;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Formatdatetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Before Formatting\n"+dt);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("E, MMM dd yyyy hh mm ss");
		String FormatDate=dt.format(format);
		System.out.println("After Formatting\n"+FormatDate);

	}

	
	

}
