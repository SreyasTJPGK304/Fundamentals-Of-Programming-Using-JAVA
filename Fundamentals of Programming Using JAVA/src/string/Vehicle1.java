package string;
import java.util.Scanner;
public class Vehicle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		StringBuffer sc=new StringBuffer();
		StringBuffer sb=new StringBuffer();
		car c=new car();
		bike b=new bike();
		
		System.out.println("1)Car");
		System.out.println("2)Bike");
		int n=s.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter the details of car");
			System.out.println("Enter the color");
			sc.append("\nColor : "+s.next());
			System.out.println("Enter the maximum speed");
			sc.append("\nSpeed : "+s.next());
			System.out.println("Enter the number of seats");
			sc.append("\nSeats : "+s.next());
			System.out.println("Enter the number of wheels");
			sc.append("\nWheels : "+s.next());
			System.out.println("Enter the number of doors");
			sc.append("\nDoors : "+s.next());
			System.out.println("Enter the status of AC(true/false");
			sc.append("\nStatus : "+s.next());
			c.details(sc);
			
			
			
			break;
		case 2:
			System.out.println("Enter the details of bike");
			System.out.println("Enter the color");
			sb.append("\nColor : "+s.next());
			System.out.println("Enter the maximum speed");
			sb.append("\nSpeed : "+s.next());
			System.out.println("Enter the number of seats");
			sb.append("\nSeats : "+s.next());
			System.out.println("Enter the number of wheels");
			sb.append("\nWheels : "+s.next());
			System.out.println("Enter the status of diskbreak(true/false)");
			sb.append("\nStatus : "+s.next());
			b.details(sb);
			
			break;
			default:
				System.out.println("Invalid Option");
		}

	}

}
class car{

	public void details(StringBuffer sc) {
		
		System.out.println(sc);
	
		
	}
	
	
}
class bike extends car{
	public void details(StringBuffer sb) {
		
		System.out.println(sb);
	}
	
}

