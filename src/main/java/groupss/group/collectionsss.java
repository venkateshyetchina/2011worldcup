package groupss.group;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsss {

	public static void main(String[] args) {
		int number[]= {1,2,4858,4930,202,11,10};
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
for(Integer i:number) {
	al.add(i);
}
System.out.println(Collections.synchronizedList(al));
System.out.println(al);

	}

}
