package string;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("enter input");
		int n=s.nextInt();
		
		String b[]=new String[n];
		for(i=0;i<n;i++) {
			b[i]=s.next();
			
		}
		char c;
		for(i=0;i<n;i++) {
			c=b[i].charAt(0);
			
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println(b[i]);
			}
		
		
		}

	}

}
