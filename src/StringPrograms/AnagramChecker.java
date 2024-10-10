package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();

		boolean areAnagrams = checkAnagrams(str1, str2);
		System.out.println(areAnagrams);

		scanner.close();
	}

	public static boolean checkAnagrams(String str1, String str2) {
		// Remove whitespace and convert to lower case
		str1 = str1.replaceAll("\\s+", "").toLowerCase();
		str2 = str2.replaceAll("\\s+", "").toLowerCase();

		// If lengths are not equal, they cannot be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert strings to character arrays
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		// Sort the character arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Compare sorted arrays
		return Arrays.equals(charArray1, charArray2);
	}
}
