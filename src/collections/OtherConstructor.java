package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class OtherConstructor {

	public static void main(String[] args) {
	 
		List<String> ls = new ArrayList<>();
		ls.add("abc");
		ls.add("abc");
		ls.add("def");
		ls.add("gef");
		
		List<String> ls2 = new ArrayList<>(ls);

		System.out.println(ls2);
		
		Set<String> set1 = new HashSet(ls);
		System.out.println(set1);
		
		
		
	}

}
