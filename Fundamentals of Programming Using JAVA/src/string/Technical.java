package string;
import java.util.Scanner;
public class Technical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="qwertyuiop asdfghjkl; zxcvbnm,./";
		char ch[]=str.toCharArray();
		
		int i,j;
		
		System.out.println("Enter a character");
		char c=s.next().charAt(0);
		System.out.println("Enter string");
		String str1=s.next();
		char ch1[]=str1.toCharArray();
		System.out.println("Original message");
		for(i=0;i<ch1.length;i++) {
			for(j=1;j<ch.length;j++) {
				if(ch1[i]==ch[j] && c=='R') {
					System.out.print(ch[j-1]);
				}
				if(str.charAt(i)==str.charAt(j) && c=='L') {
					System.out.print(ch[j+1]);
				}
			}
			
		}
		

	}

}
