package decisionmaking;
import java.util.Scanner;
public class Fallth {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("enter input");
		int n=input.nextInt();
		int T=0;
		int m=n%10;
		int a=n/10;
		if(a!=1)
		{
		switch(m)
		{
		case 1:
		case 2:
		case 6:
		        T=T+3;
		     break;
		     
		case 3:
		case 7:
		case 8:
			   T=T+5;
			   break;
			   
		case 4:
		case 5:
		case 9:
			   T=T+4;
			   
		}
		
		switch(a)
		{
		case 2:
		case 3:
		case 8:
		case 9:
			   T=T+6;
			   break;
			   
		case 4:
		case 5:
		case 6:
			   T=T+5;
			   break;
			   
		case 7:
			  T=T+7;
			  break;
			  
		}
			   
		}
		else
		{
			switch(m)
			{
			case 1:
			case 2:
				T=T+6;
				break;
				
			case 3:
			case 4:
			case 8:
			case 9:
				T=T+8;
				break;
				
			case 7:
				T=T+7;
				break;
			}
		}
		System.out.println(T);	   
		}

	}


