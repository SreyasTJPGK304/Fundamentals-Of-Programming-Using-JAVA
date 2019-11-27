package string;
import java.util.Scanner;
public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String pro="";
		String proc="";
		int i=1;
		StringBuffer sb=new StringBuffer();
		System.out.println("Registration");
		do {
		System.out.println("Enter Your Name");
		sb.append(s.next());
		System.out.println("Enter Your address");
		sb.append("\n"+s.next());
		System.out.println("Contact Number");
		sb.append("\n"+s.next());
		System.out.println("E-Mail ID");
		sb.append("\n"+s.next());
		System.out.println("Enter proof type");
		sb.append("\n"+s.next());
		System.out.println("Enter proof id");
		sb.append("\n"+s.next());
		
		System.out.printf("Thank you for registering. Your id is %d\n",i);
		i++;
		System.out.println("Do you want to continue registeration(y/n)?");
		pro=s.next();
		}while(pro.equals("y"));
		if(pro.equals("n")) {
			    
				System.out.println(sb);
			}
		

	}

}
