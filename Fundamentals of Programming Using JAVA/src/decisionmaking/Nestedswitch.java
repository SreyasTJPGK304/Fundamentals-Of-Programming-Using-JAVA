package decisionmaking;
import java.util.Scanner;
public class Nestedswitch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year ");
		int collegeYear=input.nextInt();
		switch(collegeYear)
		{
		
		case 1:
			System.out.println("English,Maths,Science");
		break;
		case 2:
			System.out.println("enter the branch");
		char branch=input.next().charAt(0);
		         switch(branch)
		         {
		         case 'C':
		        	 System.out.println("operating system,java,data structures");
		        	 break;
		        	 
		         case 'E':
		        	 System.out.println("Microprocessor,Logic switching");
		        	 break;
		        	 
		         case 'M':
		        	 System.out.println("Machine drawing,Engines");
		        	 break;
		         }
		         break;
		         
		case 3:
			System.out.println("enter the branch1");
			char branch1=input.next().charAt(0);
			switch(branch1)
			{
			case 'C':
				System.out.println("COA,PPL");
				break;
				
			case 'E':
				System.out.println("EDC,LD");
				break;
				
			case'M':
				System.out.println("ML,HHL");
				break;
			}
			break;
			
			default:
				
				System.out.println("invalid input");
				
			
			}
			
		
		}

	}



