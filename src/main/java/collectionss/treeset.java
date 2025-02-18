package collectionss;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,9,99,1,5,8,9};
TreeSet ts= new TreeSet();
for(Integer i:arr) {
	ts.add(i);
}
Iterator iterator=ts.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}


	}

}
