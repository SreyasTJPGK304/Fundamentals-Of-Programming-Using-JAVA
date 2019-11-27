package pallindrome;
import java.util.Scanner;
public class Duplicateno {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		int a[]=new int[n];
		int i,j;
		int l=a.length;
		System.out.println("Enter elements");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(i=0;i<l-1;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[i]=0;
					
				}
			}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		}
				
				
				
				
				
				
				
				
				
				

	}

}
