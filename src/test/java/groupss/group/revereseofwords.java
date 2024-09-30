package groupss.group;

public class revereseofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sen2="typical words are arranged";
String rev="";
String[] s=sen2.split(" ");
for(int i=0;i<s.length;i++) {
	//System.out.println(s[i]);
	String rev1="";
	String words=s[i];

for(int j=words.length()-1;j>=0;j--) {
	rev1=rev1+words.charAt(j);
	
	}
rev=rev+rev1+" ";

	}
System.out.println(rev);
}
}
