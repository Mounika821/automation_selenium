package week1Assignments;

public class CheckNumberIsPositive {
	
		int a=10;
		
		public void checknNumber(int a) {
			if(a>0) {
				System.out.println("The number "+a+" is Positive");
			}
			else {
				System.out.println("The number "+a+" is Negative");
			
			}
			
		}
			
			public static void main(String[] args) {
				
				CheckNumberIsPositive check = new  CheckNumberIsPositive();
				 check.checknNumber(104);
				 check.checknNumber(0);
				 check.checknNumber(-1);
				 check.checknNumber(10);
			}
}
