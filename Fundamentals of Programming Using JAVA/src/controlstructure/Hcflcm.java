package controlstructure;
import java.util.Scanner;
public class Hcflcm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int x=s.nextInt();
		System.out.println("Enter second number");
		int y=s.nextInt();
		int min,i; 
		int gcd=0;
		min=(x<y)?x:y;
		for(i=min;i>0;i--)
		{
			if(x%i==0 && y%i==0) 
			{
				gcd=i;
				break;
			}
			
		}
		
System.out.println(gcd);
                   int max,lcm=0;
                max=(x>y)?x:y;
                		for(i=max; ;i++)
                		{
                			if(i%x==0 && i%y==0)
                			{
                				lcm=i;
                				break;
                			}
                		}
                		System.out.println(lcm);
                		s.close();
	}

}
