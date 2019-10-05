package tejas.test.practice;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int [] fib  = new int[n];
		for(int i=0; i<n;i++)
			fib[i] = fibbonacci(i);
		
		for(int i=0;i<n;i++)
			System.out.print(fib[i] + ",");


	}

	private static int fibbonacci(int n) {
		if(n==0 || n==1)
			return 1;

		return (fibbonacci(n-1) + fibbonacci(n-2));
	}
}
