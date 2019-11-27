package operators;
import java.util.Scanner;
public class Swaptmp {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("before swapping");
		int n=5;
		int m=10;
		System.out.println("valueof n:" +n);
		System.out.println("valueof n:" +m);
		System.out.println("after swapping");
		int temp=n;
		n=m;
		m=temp;
		System.out.println("valueof n:" +n);
		System.out.println("valueof n:" +m);

	}

}
