package fibnocci;
import java.util.Scanner;
public class Fibnocci2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0,b=1,c=0;
		System.out.println("Enter a number");
		int n=s.nextInt();
		if(n==0) {
			System.out.println("Fibinocci number");
		}
		for(int i=0;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			
			if(c==n) {
				System.out.println("Fibnocci number");
				break;
			}
			if(c>n) {
				System.out.println("not Fibnocci number");
				break;
			}
		}

	}

}
