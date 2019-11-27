package basics;
import java.util.Scanner;
public class Display {
      public static void main(String[]args) {
    	  Scanner input=new Scanner(System.in);
    	  String a=input.nextLine();
    	  String b=input.nextLine();
    	  int m=input.nextInt();
    	  int n=input.nextInt();
    	  System.out.printf("%-15s %03d\n",a,m);
    	  System.out.printf("%-15s %03d\n",b,n);
    	  
      }

}
