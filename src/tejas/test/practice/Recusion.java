package tejas.test.practice;

import java.util.Scanner;

public class Recusion {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
		scanner.close();
		convert(input, 2);
		System.out.println();
		convert(input, 8);
		System.out.println();
		convert(input, 16);	
	}

	private static void convert(long number, int base) {
		int rem = (int) (number%base);
		if(number == 0) {
			return;
		}
		convert(number/base, base);

		if(rem < 10) {
			System.out.print(rem);
		}else {
			System.out.print((char)(rem - 10 + 'A'));
		}
	}
}
