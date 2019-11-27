package operators;
import java.util.Scanner;
public class Mathval {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a=n%10;
		int b=a*a;
		int c=n/100;
		int d=a*c;
		int res=b*d;
		System.out.printf("%d%d\n",b,d);
		System.out.printf("%d",res);
		
		

	}

}
