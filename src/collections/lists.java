package collections;

import java.util.ArrayList;
import java.util.Collection;

public class lists {

	public static void main(String[] args) {
	 
		Collection<String> list1 = new ArrayList<>();
		list1.add("Erkan");
		list1.add("omer");
		list1.add("ahmet");
		list1.add("mehmet");
		System.out.println(list1);
		Collection<String> list2 = new ArrayList<>();
		list2.add("Erkan");
		list2.add("kerem");
		list2.add("yasemin");
		list2.add("eyup");
		list1.addAll(list2);
		System.out.println(list1);
		Collection<String> list3 = new ArrayList<>();
		list3.add("jack");
		list3.add("E");
		list3.add("En");
		list3.add("Erkan");
		list1.addAll(list3);
		System.out.println(list1);
		list1.removeAll(list3);
		System.out.println(list1);
		Collection<String> list4 = new ArrayList<>();
		list4.add("Erkn");
		list4.add("Ern");
		list4.retainAll(list4);
		System.out.println(list1);
		
		
		
		
	}

}
