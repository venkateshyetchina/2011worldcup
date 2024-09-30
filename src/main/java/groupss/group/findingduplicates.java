package groupss.group;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findingduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="avc avc sdefacvc avc cde fgh fgh cde abc";
		String[] s1=s.toLowerCase().trim().split(" ");
		Map <String,Integer> map= new HashMap<>();
		for(String s3:s1) {
		if(map.containsKey(s3)) {
			map.put(s3, map.get(s3)+1);
		}
		else {
			map.put(s3,1);
		}
		}
		Set<String> sell=map.keySet();
		//
		//System.out.println(sell);
		for(String s2:sell) {
			  //if (map.get(s2) > 1) {
			System.out.println(s2+" : "+map.get(s2));
		}
		//}

}
}
