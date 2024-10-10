package NumberPrograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = scanner.nextInt();

		int reversedNum = reverseDigits(num);
		System.out.println("The reversed number is: " + reversedNum);

		scanner.close();
	}

	public static int reverseDigits(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		return reversed;
	}
}
