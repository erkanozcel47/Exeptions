package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {

	public static void main(String[] args) {
		 
		SortedSet<String> srtSet = new TreeSet<>();
		srtSet.add("abc");
		srtSet.add("ab");
		srtSet.add("abcd");
		srtSet.add("abe");
		System.out.println(srtSet);
		
		SortedSet<Integer> srtInt = new TreeSet<>();
		srtInt.add(123);
		srtInt.add(1223);
		srtInt.add(1238);
		srtInt.add(1239);
		srtInt.add(12366);
		
		System.out.println(srtInt);
		System.out.println(srtSet.first());
		System.out.println(srtSet.last());
		
		SortedSet<String> strSet1 = new TreeSet<>();
		strSet1.add("erkan");
		strSet1.add("sinan");
		strSet1.add("mumin");
		strSet1.add("nazim");
		strSet1.add("salih");
		System.out.println(strSet1.subSet("c", "y"));
		System.out.println(strSet1.headSet("k"));
		System.out.println(strSet1.tailSet("l"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
