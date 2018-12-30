package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PracticeWarmup {

	public static void main(String[] args) {
		
		
		Map<String, String> practice = new HashMap<>();
		practice.put("ozcelik", "erkan");
		practice.put("isik", "Sinan");
		practice.put("kazak", "mumin");
		practice.put("korhan", "salih");
		practice.put("evren", "nazim");
		System.out.println(practice.size());
		
		Iterator<String> iter=  practice.keySet().iterator();
		Iterator<String> iter2=  practice.values().iterator();
		
 	Set<Entry<String,String>> iterEntrySet=  practice.entrySet();
		for (Entry<String,String> each : iterEntrySet) {
			System.out.print(each.getKey()+"  ");
        	System.out.print(each.getValue());
        	System.out.println();
		}
		
		
		
		
        while(iter.hasNext()) {
        	System.out.print(iter.next()+"  ");
        	System.out.print(iter2.next());
        	System.out.println();
        }
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
