package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListImplementation {

	public static void main(String[] args) {
		 
		List<Integer> item= new ArrayList<> (Arrays.asList(55,65,488,987,654));
		
		item.remove(1);
		item.remove(3);
		for (Integer each : item) {
			System.out.println(each.toString());
		}
		
		
		
		
		
		
	}

}
