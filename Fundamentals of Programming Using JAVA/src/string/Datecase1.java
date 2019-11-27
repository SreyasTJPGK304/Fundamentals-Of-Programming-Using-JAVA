package string;
import java.util.Calendar;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Datecase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		Scanner s=new Scanner(System.in);
		
		
		String str="";
		do {
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the Address");
		String address=s.next();
		System.out.println("Number of Room");
		int room=s.nextInt();
		System.out.println("Number of Person");
		int person=s.nextInt();
		System.out.println("AC or Non-AC");
		String ac=s.next();
		System.out.println("Enter start date");
		 String start =s.next();// format 2017-11-20
		 LocalDate ds = LocalDate.parse(start);
		 System.out.println("Enter end date");
		    String end = s.next();
		    
		    LocalDate de = LocalDate.parse(end);
		    long total = ChronoUnit.DAYS.between(ds,de);
		    
		    
		    int rate=1000;
			int aac = 0,bac;
			int amount=0;
			int extra=250;
			
			 //amount=((rate*person*day));
			if(ac.equals("yes")==true) {
				aac=150;
			}
			else {
				 bac=0;
			}
			if(person>(room*3)) {
				System.out.println("Book another room");
			}
			else if(person>(room*2)) {
				amount=(((rate+aac)*room)+extra)*(int)total;
				
			}
			else {
				amount=((rate+aac)*room)*(int)total;
				
			}
		
		if(amount!=0) {
		System.out.println("Reg-Details:");
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("No.of rooms : "+room);
		System.out.println("No.of Guest : "+person);
		System.out.println("AC : "+ac);
		System.out.println("No.of Days : "+total);
		System.out.println("Amount : "+amount);
		}
		System.out.println("Do you want to continue Registeration(yes/no)");
		str=s.next();
		
		}while(str.equals("yes")==true);
			
			
		
		
		

		}	

}
