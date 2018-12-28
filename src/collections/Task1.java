package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
 
//		Scanner scan = new Scanner(System.in);
//		List<String> ls = new ArrayList<>();
//		
//		for (int i = 0; i < 10; i++) {
//		
//			ls.add(scan.nextLine());	
//		
//		}
//		System.out.println(ls);
//		Set<String> ls2= new  HashSet<>(ls);
//		System.out.println(ls2);
//     	System.out.println(	ls2.size());
//		
		
		List<String> names = Arrays.asList("Adam","Adam","Bob","Dave","Bob");
		
		Map<String,Integer> freMap = new HashMap<>();
		Integer a=0;
	 	for(String each: names) {
			freMap.put(each,a++);
		}
		System.out.println(freMap);
		
		

	}

}
