package array;
import java.util.Scanner;
public class Arrayoddeven {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
         System.out.println("Enter the size");
         int n=input.nextInt();
         int i;
         int e,d;
         int sum=0,b=0,c=0,sum1=0;
         int[] a=new int[n];
         
         for(i=0;i<n;i++) {
        	 System.out.println("enter Index["+i +"]");
        	 a[i]=input.nextInt();
         }
         for(i=0;i<n;i++) {
        	 
        	 
        	 if(a[i]%2!=0)
        	 {
        		 System.out.println(a[i]);
        		 sum=sum+a[i];
        		 b++;
        	 }
         }
        	  for(i=0;i<n;i++) {
        		  if(a[i]%2==0) {
        		 System.out.println(a[i]);
        		 sum1=sum1+a[i];
        		 c++;
        	 }
        	  }
        	 e=sum/b;
        	 d=sum1/c;
        	 System.out.println(e);
        	 System.out.println(d);
         }
        	 
       
       
    
	}


