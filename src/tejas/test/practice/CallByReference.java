package tejas.test.practice;

public class CallByReference {

	public static void main(String[] args) {
		int a = 50;
		int b = 70;
		System.out.println("Before calling function a: "+a);
		System.out.println("Before calling function b: "+b);
		updateByReference(a, b);
		System.out.println("After calling function a: "+a);
		System.out.println("After calling function b: "+b);

	}
	
	private static void updateByReference(int a, int b) {
		System.out.println("Inside a: "+a++);
		System.out.println("Inside b: "+b--);
	}

}
