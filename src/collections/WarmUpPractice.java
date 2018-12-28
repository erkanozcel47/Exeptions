package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class WarmUpPractice {

	public static void main(String[] args) {
		 
		List<Double> prices=new ArrayList<>();
		prices.add(12.21);
		prices.add(9.3);
		prices.add(78.4);
		prices.add(98.4);
		prices.add(19.2);
		prices.add(1.2);
		prices.add(19.2);
		prices.add(8.6);
		prices.add(9.3);
		prices.add(3.3);
		
		Set<Double> setPrice = new HashSet<>(prices);
		System.out.println(setPrice);
		

		 SortedSet<Double> setPriceOrdered = new TreeSet<>(prices);
		System.out.println(setPriceOrdered);
		  
		System.out.println(setPriceOrdered.subSet(5.0, 10.0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
