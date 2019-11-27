package array;
import java.util.Scanner;
public class Add2array {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the size");
		int n=input.nextInt();
		int[] a=new int[5];
		int[] b=new int[5];
		int i;
		for(i=0;i<3;i++)
		{
			System.out.println("Enter array1index["+i + "]");
			a[i]=input.nextInt();
		}
		for(i=0;i<3;i++)
		{
			System.out.println("Enter array2index["+i +"]");
			b[i]=input.nextInt();
		}
		for(i=0;i<3;i++)
		{
			System.out.println(a[i]+b[i]);
		}

	}

}
