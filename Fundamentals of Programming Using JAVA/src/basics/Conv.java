package basics;

import java.util.Scanner;

public class Conv {
	public static void main(String[]args) {
		System.out.println("enter a character");
		Scanner input=new Scanner(System.in);
	    char c =input.next().charAt(0);
	    System.out.printf("%d",(int)c);

}
}