package groupss.group;

public class panidromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=144;
		int temp=number;
		int digits=0;
		int rev=0;
		
		while(number>0) {
			digits=number%10;//1
			rev=(rev*10)+digits;
			number=number/10;
		}
		if(temp==rev) {
			System.out.println("its a palindrome number");
			
		}
		else {
			System.out.println("not a palindrome number");
		}
		
		
		
		
		
	}

}
