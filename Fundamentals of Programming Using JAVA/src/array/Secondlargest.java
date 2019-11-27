package array;
import java.util.Scanner;
import java.util.Arrays;
public class Secondlargest {

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
		Arrays.sort(a);
			System.out.println(a[n-2]);
		
}
}
