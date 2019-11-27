package decisionmaking;
import java.util.Scanner;
public class Ifelseiflad2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		if(age>=70)
		{
			System.out.println("Old");
		}else if(age<70&&age>=40) {
			System.out.println("middle");
		}else if(age<40&&age>=20) {
			System.out.println("teenage");
		}else
		{
			System.out.println("childrens");

	}

	}

}
