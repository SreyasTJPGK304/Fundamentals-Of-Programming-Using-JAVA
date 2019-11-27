package fibnocci;
import java.util.Scanner;
public class Fibnocci3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0,b=1,c=0;
		System.out.println("Enter index");
		int n=s.nextInt();
		if(n==0) {
			System.out.println(a);
		}
		if(n==1) {
			System.out.println(b);
		}
		if(n>1) {
			for(int i=2;i<n;i++) {
				c=a+b;
				a=b;
				b=c;
				
			}
			System.out.println(c);
		}
	s.close();
}
}
