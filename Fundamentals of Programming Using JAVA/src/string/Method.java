package string;
import java.util.Scanner;
public class Method {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a="now is";
		String b="the time";
		String c=" the";
		System.out.println("length : "+a.length()); //to find length of string
		System.out.println("Sub string : "+a.substring(2,5));//to find substring start with 2 to less than 5
		System.out.println("index : "+a.indexOf("is")); //to find index
		System.out.println("concat : "+a.concat(c)); //to concat two string
        System.out.println("replace : "+b.replace("t", "T"));  //to replace
        System.out.println("Equal : "+b.equals(c));// to check two strings are equal
        System.out.println("Starts with : "+b.startsWith("the"));
        System.out.println("Lowercase : "+b.toLowerCase());//covert into lower case
        System.out.println("Uppercase : "+b.toUpperCase());//convert into upper case
        String str[]=a.split(" ");//split two strings
        System.out.print("Split : ");
        for(int i=0;i<str.length;i++) {
        System.out.print(str[i]);
        }
	
	}

}
