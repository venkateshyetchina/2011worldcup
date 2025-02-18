package iframes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class typecastingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s="new";
System.out.println(s.getClass().getName());*/
		
		String str="new one";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		Set<Entry<Character,Integer>>entry=map.entrySet();
	    for(Entry<Character,Integer>en:entry) {
	    	Character ch=en.getKey();
	    	Integer i=en.getValue();
	    	System.out.println(ch+"~~~~~~~~~~~~~~~~~~~"+i);
	    }
	
		

}
}
