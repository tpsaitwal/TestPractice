package tejas.test.practice;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {
	public static void main(String[] args) {
		List myGenericList = new ArrayList();
		myGenericList.add(463);
		myGenericList.add("Tejas");
		myGenericList.forEach(System.err::println);
		myGenericList.add(75.125);
		myGenericList.forEach(System.out::println);
		myGenericList.add(true);
		myGenericList.forEach(System.err::println);		
	}
}
