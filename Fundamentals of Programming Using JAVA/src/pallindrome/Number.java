package pallindrome;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int r,rev=0;
		int b=n;
		while(n!=0) {
		r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
		if(rev==b) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("not pallindrome");
		}

	}

}
