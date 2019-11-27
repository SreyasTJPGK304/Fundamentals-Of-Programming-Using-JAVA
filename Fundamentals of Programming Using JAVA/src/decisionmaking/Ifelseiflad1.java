package decisionmaking;
import java.util.Scanner;
public class Ifelseiflad1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int mark=input.nextInt();
		if(mark>=90)
		{
			System.out.println("Grade A");
		}else if(mark<90&&mark>=80) {
			System.out.println("Grade B");
		}else if(mark<80&&mark>=70) {
			System.out.println("Grade C");
		}else
		{
			System.out.println("exam failed");

	}

}
}
