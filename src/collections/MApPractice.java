package collections;

import java.util.HashMap;
import java.util.Map;

public class MApPractice {

	public static void main(String[] args) {
		 
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Soccer");
		map.put(2, "Basketball");
		map.put(3, "Pinkponk");
	    System.out.println(map);	
	    
	    Map<Double,String> map2 = new HashMap<>();
	    map2.put(2.6, "erkan");
		map2.put(2.6, "erkan");
		map2.put(3.5, "sinan");
		map2.put(4.3, "ahmet");
		map2.put(559.3, "mumin");
		map2.put(66.3, "salih");
	    
		System.out.println(map2);
		map2.remove(2.6);
		map2.replace(66.3, "emrah");
		System.out.println(map2);
		
		
		
		
		
		
		
		
		

	}

}
