package programsascending;

public class ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,9,8,1,4,5,6,2,3};
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length;j++) {
		if(arr[i]<arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]+" ");
}
	}

}
