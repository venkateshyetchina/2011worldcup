package groupss.group;


/*public class movingtoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {0,1,2,39,0,5,6};
int j=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0 && arr[j]==0) {
		int temp=arr[i];
		 arr[i]=arr[j];
		arr[j]=temp;
	}
	else if(arr[j]!=0){
		arr[j]++;
		
	}
	
}
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}


}

}
*/


public class  movingtoend {

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 39, 0, 5, 6};
        int j = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is non-zero and arr[j] is zero, swap them
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; // Move j to the next position after the swap
            }
            // If arr[j] is not zero, move j forward
            else if (arr[j] != 0) {
                j++;
            }
        }

        // Print the modified array after moving zeros to the end
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



