package tejas.test.practice;

import java.util.LinkedList;
import java.util.List;

public class NumberLinkedList {
	
	public static void main(String[] args) {
		List<Integer> integerList = new LinkedList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);
		
		Object[] integrArray = new Integer[integerList.size()];
		
		integrArray = integerList.toArray();
		for (Object integer : integrArray) {
			System.out.println(integer);
		}
	}

}
