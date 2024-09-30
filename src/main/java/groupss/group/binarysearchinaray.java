package groupss.group;

public class binarysearchinaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {12,5,9,11,20,6};
boolean flag=false;
int key=11;
int l=0;
int h=ar.length-1;
while(l<h) {
	int m=(l+h)/2;
	if(ar[m]==key) {
		System.out.println("element found at index:"+ar[m]);
		flag = true;
		break;
	}
	if(ar[m]<key) {
		l=m+1;
	}
	if(ar[m]>key) {
		
	}
	
}
if(flag==false) {
	System.out.println("elemnt not in indexes");
}

	}

}
