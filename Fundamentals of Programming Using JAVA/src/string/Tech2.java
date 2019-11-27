package string;
import java.util.Arrays;
import java.util.Scanner;
public class Tech2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter Guest name");
		String gname=s.next();
		System.out.println("Enter Residence name");
			String rname=s.next();
			System.out.println("Enter the letters in pile");
			String pile=s.next();
			
			String str=gname+rname;
			int l=str.length();
			int p=pile.length();
			char chp[]=pile.toCharArray();
			char chl[]=str.toCharArray();
			Arrays.sort(chl);
			Arrays.sort(chp);
			String x=new String(chl);
			String y=new String(chp);
			int i,j;
			for(i=0;i<l;i++) {
				flag=0;
				for(j=0;j<p;j++) {
					if(l==p && x.contentEquals(y)) {
						
						flag=1;
						break;
					}
					
				}
				
			
		}
			if(flag==1) {
				System.out.println("yes");
			}
			else {
				System.out.println("No");
			}

	}

}
