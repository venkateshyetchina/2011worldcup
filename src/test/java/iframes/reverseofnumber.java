package iframes;

public class reverseofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*int number=12345;
 int reverse=0;
 int digits=0;
 while(number>0) {
	 digits=number%10;
	 reverse=(reverse*10)+digits;
	 number=number/10;
 }
 System.out.println(reverse);
		
		*/
		
		int number=12345;
		int digits=0;
		int sum=0;
		while(number>0) {
			digits=number%10;
			sum=digits+sum;
			number=number/10;
		}
		System.out.println(sum);
	}

}
