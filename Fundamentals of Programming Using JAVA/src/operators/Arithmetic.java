package operators;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter first integer");
		int a=input.nextInt();
		System.out.println("enter Second integer");
		
		int b=input.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

	}

}
