package collectionss;

public class vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="we are learning java";
str=str.toLowerCase();
int vowel=0;
int cons=0;
 int count = 0;
for(int i=0;i<str.length();i++) {
	
	if(str.charAt(i)!=' ') {
		count++;
	}
	if(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
		vowel++;
	}
	else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
		cons++;
		
	}
}
System.out.println("count :"+count);
System.out.println("vowel:"+vowel);
System.out.println("cons:"+cons);
	}

}
