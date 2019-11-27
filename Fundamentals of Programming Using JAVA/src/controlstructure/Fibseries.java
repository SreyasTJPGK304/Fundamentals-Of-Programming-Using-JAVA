package controlstructure;
import java.util.Scanner;
public class Fibseries {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		int i;
		int m=0;
		
		
		int a=0,b=1;
		int c=0;
		
          for(i=1;i<=100;i++)
          {
        	  c=a+b;
        	  if(a==n)
        	  {
        		  m++;
        	  }
        	  
        	  a=b;
        	  b=c;
          }
          if(m!=0) {
        	  System.out.println("YES");
          }
          else {
          System.out.println("NO");
          }
		

	}

}


