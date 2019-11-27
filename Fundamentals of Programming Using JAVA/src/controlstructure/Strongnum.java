package controlstructure;
import java.util.Scanner;
public class Strongnum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		int res=n;
		int i=1,r,sum=0;
		
		while(n!=0) {
			int fact=1;
			r=n%10;
			for(i=1;i<=r;i++) {
			fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
			
		}
		if(sum==res) {
			System.out.println("Number is strong");
		}
		else {
			System.out.println("Number is not strong");
		}
		s.close();

	}

}
