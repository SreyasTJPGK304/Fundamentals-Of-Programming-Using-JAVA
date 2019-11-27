package decisionmaking;
import java.util.Scanner;
public class Leapyear2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int n=s.nextInt();
		if((n%4==0 && n%100!=0) || (n%400==0)){
			System.out.println("Leap year");
		}
		else {
			System.out.println("not leap year");
		}
		s.close();	

	}

}
