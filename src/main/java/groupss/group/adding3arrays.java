package groupss.group;

public class adding3arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add=0;
int a1[]= {1,2,3,4,5};
int a2[]= {6,7,8,9,10};
int a3[]= {11,12,13,14,15};
int sumofThree[]=new int[a1.length+a2.length+a3.length];
for(int i=0;i<a1.length;i++) {
	sumofThree[i]=a1[i];
}
for(int i=0;i<a2.length;i++) {
	sumofThree[i+a1.length]=a2[i];
}
for(int i=0;i<a3.length;i++) {
	sumofThree[i+a1.length+a2.length]=a3[i];
}
for(int sum:sumofThree) {
	//System.out.println("sumofarrays:"+sum);
	add=sum+add;
}
System.out.println(add);
	}

}
