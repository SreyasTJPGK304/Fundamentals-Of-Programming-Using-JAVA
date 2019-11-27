package pallindrome;
import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int i,sum=0;
		for(i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(n==sum) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("not Perfect number");
		}

	}

}
