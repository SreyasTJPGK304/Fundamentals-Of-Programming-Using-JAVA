package array;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size");
		int n=input.nextInt();
		int i;
		int m=0;
		int[] a=new int[n];
		for(i=0;i<n;i++) {
			System.out.println("enter Index["+i +"]");
			a[i]=input.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>=m) {
				m=a[i];
			}
		}
		System.out.println("Largest number=" + m);

	}

}
