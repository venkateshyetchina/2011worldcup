package collectionss;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map map= new HashMap();
map.put(1, "kohli");
map.put(2,"rohit");
map.put(3,"sachin");
map.put(4,"yuvarajsingh");

Set<Entry<Integer,String>>entries=map.entrySet();
for(Entry<Integer,String>en:entries) {
	Integer keys=en.getKey();
	String values=en.getValue();
	System.out.println(keys+"::::"+values);
	System.out.println(map);
}

	}

}
