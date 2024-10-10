package NumberPrograms;

import java.util.Scanner;

public class MixedSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // Reading N from standard input

		int result = findNthTerm(N);
		System.out.println(result);

		scanner.close();
	}

	// Function to calculate the Nth term
	public static int findNthTerm(int N) {
		if (N % 2 == 1) {
			return findFibonacci((N / 2) + 1); // N is odd, get Fibonacci term
		} else {
			return findPrime(N / 2); // N is even, get prime number term
		}
	}

	// Function to find the nth Fibonacci number
	public static int findFibonacci(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		int a = 1, b = 2, fib = 0;
		for (int i = 3; i <= n; i++) {
			fib = a + b;
			a = b;
			b = fib;
		}
		return fib;
	}

	// Function to find the nth prime number
	public static int findPrime(int n) {
		int count = 0, num = 2;
		while (true) {
			if (isPrime(num)) {
				count++;
				if (count == n) {
					return num;
				}
			}
			num++;
		}
	}

	// Helper function to check if a number is prime
	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
