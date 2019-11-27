package string;
import java.util.Scanner;
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee name");
		StringBuffer sb=new StringBuffer(s.next());
		sb.append(" Warrior");    //append
		sb.insert(6, "Prakash ");    //insert into particular position
		sb.replace(6, 13, "Prasanth");       //replace from index 6-13
		sb.delete(6,14);      //delete from index 6-14
		sb.reverse();      //reverse
		System.out.println("Employee salary");
		int salary=s.nextInt();
		System.out.println("Age");
		int age=s.nextInt();
		
		System.out.println("Name : "+sb);
		System.out.println("Salary : "+salary);
		System.out.println("Age : "+age);
		

	}

}
