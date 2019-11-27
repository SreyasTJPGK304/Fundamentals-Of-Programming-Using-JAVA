package pallindrome;
import java.util.Scanner;
public class Secondlar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		int a[]=new int[n];
		int i,max1=0,max2=0;
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++) {
			if(a[i]>=max1) {
				max2=max1;
				max1=a[i];
			}
			else {
				if(a[i]>max2 && a[i]<max1) {
					max2=a[i];
				}
			}
		
		}
		System.out.println(max2);

	}

}
