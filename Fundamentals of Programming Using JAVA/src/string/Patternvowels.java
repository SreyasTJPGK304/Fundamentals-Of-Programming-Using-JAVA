package string;

import java.util.Scanner;

public class Patternvowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i,j,k;
		int count=0;

		
		for(i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
		
			
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				count++;
				for(j=0;j<count;j++) {
					System.out.print("*");
				}
				System.out.print(ch);
				for(k=0;k<count;k++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print(ch);
			}
			}
	}
		}
				
				
				