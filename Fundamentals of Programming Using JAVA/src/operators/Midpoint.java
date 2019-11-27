package operators;
import java.util.Scanner;
public class Midpoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter coordinates");
		int x1=input.nextInt();
		int x2=input.nextInt();
		int y1=input.nextInt();
		int y2=input.nextInt();
		int x= x1+x2/2;
		int y= y1+y2/2;
		System.out.printf("midpoint is %d%d",x,y);
		
	}

}
