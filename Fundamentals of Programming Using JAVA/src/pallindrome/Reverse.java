package pallindrome;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		int length=str.length();
		int i;
		String rev="";
		for(i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
		
			
		}
		
				
		

	}


