package pallindrome;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int b=a;
		int c=a;
		int count=0;
		int r,sum=0;
		while(c!=0) {
			count++;
			c=c/10;
		}
		while(a!=0) {
			r=a%10;
			sum=(int)((double)sum+Math.pow(r, count));
			a=a/10;
		}
		if(b==sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("not armstrong");
		}

	}

}
