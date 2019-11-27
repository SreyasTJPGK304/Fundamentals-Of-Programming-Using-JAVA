package string;
import java.util.Scanner;
public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int a[]=new int[n];
		  int i,j,x=0;
		  for(i=0;i<n;i++){
			  a[i]=s.nextInt();
		  }
		  
		  
		   for(i=0;i<n;i++){
			  
			  
		  
		  
		  
		  
		  for(j=i+1;j<n;j++){
			 if(i%2==0){
			  if(a[i]<a[j]){
				  x=a[i];
				  a[i]=a[j];
				  a[j]=x;
			  }
		  }
		  }
		  }
			   for(i=0;i<n;i++){
				   System.out.print(a[i]+", ");
			   }

	}

}
