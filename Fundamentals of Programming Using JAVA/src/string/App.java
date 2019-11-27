package string;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		System.out.println("Enter name");
		sb.append(s.next());
		System.out.println("Enter id");
		sb.append("\n"+s.next());
		System.out.println("Enter age");
		sb.append("\n"+s.next());
		System.out.println("Enter salary");
		sb.append("\n"+s.next());
		System.out.println(sb);

	}

}
