package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LoopingMAp {

	public static void main(String[] args) {

		Map<String,String> jopMap = new HashMap<>();
		jopMap.put("SDET", "Viena");
		jopMap.put("MAnnual Tester", "Fairfax");
		jopMap.put("DBA", "HernDon");
		jopMap.put("ScrumMAster","Reston");
		jopMap.put("ProductOvnew", "FairFax");
		jopMap.put("ScrumMAster", "DC");
		
//		System.out.println(jopMap);
		
//		Set<String> keys= jopMap.keySet();
//		
//		for (String each : keys) {
//			System.out.println(each);
//		}
//		
//		Iterator<String> iter=keys.iterator();
//		while(iter.hasNext()) {
//			System.out.print(iter.next()+"  ");
//		}
//		
//		
//		
//		Collection<String> allValues= jopMap.values();
//		Iterator iter2= allValues.iterator();
//		while(iter2.hasNext()){
//			System.out.println(iter2.next());
//		}
//		for (String each : allValues) {
//			System.out.print(each+"  ");
//		}
//		
//		
		
	
		Set<Entry<String,String>> entries= jopMap.entrySet();
		for (Entry<String, String> each : entries) {
			System.out.print (each.getKey()+"  ");
			System.out.println(each.getValue()+"  ");
			
			if(each.getKey().equals("ProductOvnew")) {
				each.setValue("Tyson");
			}
			
		}
		
 		System.out.println(jopMap);
		
	}

}
