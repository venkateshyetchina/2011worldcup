package groupss.group;

public class ADDINGTWOARRAYS {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};
        int add=0;
        // Ensure both arrays have the same length
        if (a1.length != a2.length) {
            System.out.println("Arrays must be of the same length.");
            return;
        }
        
        int[] sumArray = new int[a1.length+a2.length];
        
        // Calculate the sum of corresponding elements
        for (int i = 0; i < a1.length; i++) {
            sumArray[i] = a1[i] ;
        }
        for(int i=0;i<a2.length;i++) {
        	sumArray[i+a1.length]=a2[i];
        }
        
        // Print the result
        System.out.println("Sum of the arrays:");
        for (int sum : sumArray) {
            //System.out.println(sum);
        	add=sum+add;
        }
        System.out.println(add);
    }
}
