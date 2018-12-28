package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
	 
		
		Set<Integer> numSets = new HashSet<>();
		numSets.add(123);
		numSets.add(1);
		numSets.add(13);
		numSets.add(123);

		System.out.println(numSets);
		for (Integer each : numSets) {
			System.out.println(each);
		}
		Iterator<Integer> setIter = numSets.iterator();
		while(setIter.hasNext()) {
			 Integer i =setIter.next();
			 if(i>100) {
				 setIter.remove();
				 System.out.println("Deleted "+ i);
			 }
		}
		System.out.println(numSets);
	}

}
