package controlstructure;
import java.util.Scanner;
public class Fibnocciseries {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i;
		int a=0,b=1;
		int c;
		System.out.printf("%d%d",a,b);
		for(i=0;i<10;i++)
		{
			c=a+b;
		
			System.out.printf("%d",c);
			
			a=b;
			b=c;
		}
	

	}

}
