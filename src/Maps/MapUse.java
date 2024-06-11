package Maps;

   import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		
		HashMap<String, Integer>map = new HashMap<>();
		
		//insert 
		map.put("abc", 1);
		map.put("def", 2);
		
		//size 
		System.out.println("size :" + map.size());
		
		// check whether map has any data i.e. check presence 
		
		if(map.containsKey("abc")) {
			System.out.println("Has abc");
		}
		if(map.containsKey("abc1")) {
			System.out.println("has abc1");
		}
		
		// to check value presence tc = n 
		if(map.containsValue(2)) {
			System.out.println("has 2 as value");    
		}
		
		//get value
		
		int v = 0;
		if(map.containsKey("abc1")) {
			v = map.get("abc1");
		}
		System.out.println(v);
		
		// remove value 
		
		int S = map.remove("abc");
		System.out.println(S);
		
		// iterate over map
		
		Set <String>keys = map.keySet();
		for(String str : keys) {
			System.out.println(str);
		}
		

	}

}
