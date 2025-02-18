package collectionss;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class frequencyofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Character,Integer>map= new HashMap<Character,Integer>();
String str="cricketisnicegame ";
for(int i=0;i<str.length();i++) {
	char ch=str.charAt(i);
	if(map.containsKey(ch)) {
		map.put(ch, map.get(ch)+1);
	}
	else {
		map.put(ch, 1);
	}
}
Set<Entry<Character,Integer>>entries=map.entrySet();
for(Entry<Character,Integer>en:entries) {
	Character c=en.getKey();
	Integer i=en.getValue();
	System.out.println(c+":::"+i);
}

	}

}
