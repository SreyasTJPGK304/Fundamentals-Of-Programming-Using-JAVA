package fibnocci;
import java.util.Scanner;
public class Fibnocci1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		System.out.println("Enter elements");
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(i=0;i<n/2;i++) {
			System.out.println(a[i]);
		}
		for(i=n-1;i>n/2-1;i--) {
			System.out.println(a[i]);
		}

	}

}
