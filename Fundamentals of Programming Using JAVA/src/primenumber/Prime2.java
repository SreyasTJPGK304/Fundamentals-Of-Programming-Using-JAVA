package primenumber;
import java.util.Scanner;
public class Prime2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int s1=s.nextInt();
		System.out.println("Enter the upper limit");
		int s2=s.nextInt();
		int i,j,flag=0;
		for(i=s1+1;i<s2;i++) {
			flag=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					
				
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}

	}

}
