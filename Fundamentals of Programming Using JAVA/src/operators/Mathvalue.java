package operators;

import java.util.Scanner;

public class Mathvalue {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=a%10;
		int c=a/10;
		int d=b*c;
		int e=c*c;
		
		System.out.printf("%d%d",d,e);
		

	}

}
