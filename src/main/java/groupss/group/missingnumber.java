package groupss.group;

public class missingnumber {
	 int missing(int array[],int number) {
		 int sum=0;
		 int sum1=0;
		 int diff;
		 for(int i=0;i<number-1;i++) {
			 sum=sum+array[i];
		 }
		 sum1=number*(number+1)/2;
		 diff=sum1-sum;
		 return diff;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
missingnumber m= new missingnumber();
int[] n= {1,2,5,3};

System.out.println(m.missing(n,5));


	}

}
