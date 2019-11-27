package string;
import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter input");
		String n=s.next();
		 
		
		String a=""+n.charAt(3)+n.charAt(4);
		
		
		switch(a)
		{
		case "01":
			System.out.println("January");
			break;
		case "02":
			System.out.println("February");
			break;
		case "03":
			System.out.println("March");
			break;
		case "04":
			System.out.println("April");
			break;
		case "05":
			System.out.println("May");
			break;
		case "06":
			System.out.println("June");
			break;
		case "07":
			System.out.println("July");
			break;
		case "08":
			System.out.println("August");
			break;
		case "09":
			System.out.println("September");
			break;
		case "10":
			System.out.println("October");
			break;
		case "11":
			System.out.println("November");
			break;
		case "12":
			System.out.println("December");
			break;
			default:
				System.out.println("invalid input");
		}
	}

}
