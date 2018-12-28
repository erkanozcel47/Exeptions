package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingObject {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Adam");
		names.add("Dave");
		names.add("Zain");
		names.add("Bob");
		names.add("Bob");
		

		Collections.sort(names);
		System.out.println(names);
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Adam",22));
		people.add(new Person("Dave",36));
		people.add(new Person("Zain",35));
		people.add(new Person("Bob",45));
		
		System.out.println(people);
	 
		
	}

}
