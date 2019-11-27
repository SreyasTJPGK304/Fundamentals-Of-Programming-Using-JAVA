package operators;
import java.util.Scanner;
public class Interest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int p=input.nextInt();
		int n=input.nextInt();
		float r=input.nextFloat();
		float num=(p*n*r)/100;
		System.out.printf("%f.2f",num);

	}

}
