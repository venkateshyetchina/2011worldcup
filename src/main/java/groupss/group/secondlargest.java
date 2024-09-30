package groupss.group;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {99,81,1,2,3,4,101,121,888,999,22122};
int largest=0;
int second=0;
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]+"\t");
}
for(int i=0;i<a.length;i++) {
	if(a[i]>largest) {
		second=largest;
		largest=a[i];
	}
	else if(second<a[i]){
		second=a[i];
	}
}
System.out.println("second largest number"+second);
System.out.println("largest number:"+largest);
	}

}
