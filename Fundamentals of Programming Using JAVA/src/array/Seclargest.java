package array;
import java.util.Scanner;
public class Seclargest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size");
		int n=input.nextInt();
		int i,j;
		int temp;
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter Index["+i +"]");
			a[i]=input.nextInt();
			
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(a[n-2]);

	}

}
