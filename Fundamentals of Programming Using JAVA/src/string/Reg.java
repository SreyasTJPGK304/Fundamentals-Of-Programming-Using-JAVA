package string;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String email = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		 Pattern psw = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		 Pattern pattern = Pattern.compile(email);
		 
		 
		System.out.println("Enter Username");
		String username=s.next();
		Matcher em=pattern.matcher(username);
		System.out.println("enter Password");
		String password=s.next();
		System.out.println(username);
		System.out.println(password);
		
		Matcher pas=psw.matcher(password);
		if(em.matches()) {
			System.out.println("Valid Email ID");
		}
		else {
			System.out.println("Invalid email ID");
		}
		if(pas.matches()) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Incorrect Password");
		}

	}

}
