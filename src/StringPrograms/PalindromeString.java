package StringPrograms;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		boolean isPalindrome = checkPalindrome(input);
		System.out.println(isPalindrome ? "Given String is Palindrome" : "Given String is not Palindrome");

		scanner.close();
	}

	public static boolean checkPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
