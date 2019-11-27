package operators;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("before swapping");
		int n=5;
		int m=10;
		System.out.println("valueof n:" +n);
		System.out.println("valueof n:" +m);
		System.out.println("after swapping");
		n=n+m;
		m=n-m;
		n=n-m;
		System.out.println("valueof n:" +n);
		System.out.println("valueof n:" +m);
	}

}
