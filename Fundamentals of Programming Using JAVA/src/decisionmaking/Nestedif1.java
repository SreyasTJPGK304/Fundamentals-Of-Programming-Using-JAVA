package decisionmaking;

public class Nestedif1 {

	public static void main(String[] args) {
		Double n1=1.2, n2=3.5, n3=1.0, n4=-6.5, largestnumber;
		
		if(n1>=n2) {
			if(n1>=n3) { 
				largestnumber=n1;
			}else {
				largestnumber=n3;
			}
			
		}else {
			if(n2>=n3) {
				largestnumber =n2;
			}else {
				largestnumber=n3;
			}
		}
		System.out.println("largestnumber is" + largestnumber);

	}

}
