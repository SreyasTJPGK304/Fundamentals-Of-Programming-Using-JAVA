package controlstructure;
import java.util.Scanner;
public class Num {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter input 1");
		System.out.println("Enter input 2");
		int a=input.nextInt();
		int b=input.nextInt();
		int i,sum=0;
		for(i=1;i<=100;i++)
		{
			sum += i;
		}
		System.out.println("sum= " + sum);
		}
}
