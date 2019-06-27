package tejas.test.practice;

public class CheckImmutability {

	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Hello";
		
		System.out.println("String1 hashcode "+ string1.hashCode());
		string1.concat(" World!");

		System.out.println("String1 hashcode "+ string1.hashCode());
		System.out.println("String2 hashcode "+ string2.hashCode());
		System.out.println();
		
		MyClass myClass1 = new MyClass();
		myClass1.name = "Tejas";
		myClass1.age = 25;
		myClass1.myInnerArray = new String[]{"India", "Europe","Egypt"};
		
		MyClass myClass2 = new MyClass();
		myClass2.name = "Tejas";
		myClass2.age = 25;
		myClass2.myInnerArray = new String[]{"India", "Europe","USA"};
		
		System.out.println("MyClass1 hashcode "+ myClass1.hashCode());
		System.out.println("MyClass2 hashcode "+ myClass2.hashCode());
		System.out.println();
		
		System.out.println("MyClass1 name hashcode "+ myClass1.name.hashCode());
		System.out.println("MyClass2 name hashcode "+ myClass2.name.hashCode());
		System.out.println();		
		
		for (String string : myClass1.myInnerArray) {
			System.out.println("MyClass1 myInnerArray: "+string.hashCode());
		}
		for (String string : myClass2.myInnerArray) {
			System.err.println("MyClass2 myInnerArray: "+string.hashCode());
		}
	}
}

class MyClass{
	public String name;
	public int age;
	public String [] myInnerArray;
}
