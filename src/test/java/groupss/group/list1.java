package groupss.group;

import java.util.ArrayList;

public class list1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al1= new ArrayList();
al1.add("a");
al1.add("b");

al1.add("c");
al1.add("d");

ArrayList a2=new ArrayList();
a2.add("d");
a2.add("a");
a2.add("g");
a2.add("h");
System.out.println(al1.retainAll(a2));
System.out.println("Common elements: " + al1);
System.out.println("Common elements: " + a2);
System.out.println(al1);

	}

}
