package basics;
import java.util.Scanner;
public class Char {

	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the character1");
		char ch=input.next().charAt(0);
		System.out.println(ch);
		
		System.out.println("enter the character2");
		char ch2=input.next().charAt(0);
		System.out.println(ch2);
	}

}
