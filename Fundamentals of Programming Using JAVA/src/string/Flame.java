package string;
import java.util.Scanner;
public class Flame {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name1");
		String name1=s.next();
		System.out.println("Enter name2");
		String name2=s.next();
	
		String f="flames";
		int i,j,count=0,tl=0,num=0;
		
		char n[]=name1.toCharArray();
		  char gn[]=name2.toCharArray();
		for(i=0;i<name1.length();i++) {
			
			for(j=0;j<name2.length();j++) {
				
				if(n[i]!=gn[j]) {
					n[i]='*';
					gn[j]='*';
					break;
					
				}
			}
		}
		String tname=new String(n);
		  tname=tname+(new String(gn));
		  tname=tname.replace("*","");
		  tl=tname.length();
		  System.out.println(tl);
		
		  for(int k=6;k>=2;k++) {
			  if(tl>k)
				     num=tl-k;
				   else
				     num=tl;
				   while(num>k)
				   {
				     num=num-k;
				   } 
				   //f=f.substring(num,f.length())+(f.substring(0,num-1)); 
				  }
		  switch(f.charAt(0))
		  {
		   case 'f': System.out.println("Relationship = Friends"); break;
		   case 'l': System.out.println("Relationship = Lovers"); break;
		   case 'a': System.out.println("Relationship = Affections"); break;
		   case 'm': System.out.println("Relationship = Married"); break;
		   case 'e': System.out.println("Relationship = Enemy"); break;
		   
		  }
	
	
				
					
				
			
		

	}

}
