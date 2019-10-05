package tejas.test.practice;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println("GCD is "+GCD(a,b));
	}
	
	private static int GCD(int a, int b) {
		System.out.println("Value of a: "+a + ", b: "+b);
		if(b ==0)
			return a;
		return GCD(b,a%b);
	}

}
