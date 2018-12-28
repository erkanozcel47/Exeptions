package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUp {

	public static void main(String[] args) {
//		
//		ArrayList<Integer> listOfInts = new ArrayList<>( Arrays.asList(55,65,488,987,654));
//		listOfInts.add(123);
//		listOfInts.add(456);
// 
//		for (Integer each : listOfInts) {
//			System.out.println(each.toString());
//		}
//		
//		
//			
		
		int[] myArr= {1,3,5,6,7};
		myArr =addElement(myArr,100);
		System.out.println(Arrays.toString(myArr));
		
		
		
		
		
		
		
 		}
 		
		
		
		
		
	public static int[] addElement(int [] originalArr, int newItem) {
		int[] newArr = new int[originalArr.length+1];
		for (int i = 0; i < originalArr .length; i++) {
			newArr[i]=originalArr[i];
		}
		newArr[newArr.length-1]=newItem;
		return newArr;
	}
	
	
	
	
	
	
}
