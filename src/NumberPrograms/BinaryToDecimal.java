package NumberPrograms;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		String binaryString = scanner.nextLine();

		int decimalNumber = binaryToDecimal(binaryString);
		System.out.println(decimalNumber);

		scanner.close();
	}

	public static int binaryToDecimal(String binary) {
		int decimal = 0;
		int base = 1; // 2^0

		// Convert binary to decimal
		for (int i = binary.length() - 1; i >= 0; i--) {
			if (binary.charAt(i) == '1') {
				decimal += base;
			}
			base *= 2; // Move to the next power of 2
		}

		return decimal;
	}
}
