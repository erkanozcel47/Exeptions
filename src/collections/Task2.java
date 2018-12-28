package collections;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {

		String str = "ABCDEKFHKCHGHJKLASDFGHJKLWERTYUIOZXCVBSJJCNKDFMAFC";
		// CREATE A FREQUENCY TABLE USING MAP.

		Map<Character, Integer> table = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);

			if (!table.containsKey(c)) {
				table.put(c, 1);
			} else {
				table.put(c, table.get(c)+1);
			}
		}

		System.out.println(table);

	}

}
