package string;
import java.util.Scanner;
public class Voecons {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter input");
		String str=s.nextLine();
		int i;
		int l=str.length();
		int count=0;
		int p=0,d=0,con=0,up=0,low=0,sp=0;
		for(i=0;i<l;i++) 
		 {
			char c=str.charAt(i);
			if(c>='A'&&c<='Z') {
				up++;
			}
			if(c>='a' && c<='z') {
				low++;
			}
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			count++;
		}
		else if(c=='@'||c=='&'||c=='%') {
			p++;
		}
		else if(c>='0'&&c<='9') {
			d++;
		}
		else if(c==' ') {
			sp++;
		}
		else
		{
			con++;
		}
		 }
		
		
		System.out.println("Vowels : "+count);
		System.out.println("Specialcharacter : "+p);
		System.out.println("Digits : "+d);
		System.out.println("Consonants : "+con);
		System.out.println("Spaces : "+sp);
		System.out.println("Uppercase : "+up);
		System.out.println("Lowercase : "+low);
		 
	}

}
