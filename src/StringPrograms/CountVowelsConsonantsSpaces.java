package StringPrograms;

import java.util.Scanner;

public class CountVowelsConsonantsSpaces {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		countCharacters(input);

		scanner.close();
	}

	public static void countCharacters(String str) {
		int vowels = 0;
		int consonants = 0;
		int spaces = 0;

		str = str.toLowerCase(); // Convert to lowercase for uniformity

		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				if (isVowel(ch)) {
					vowels++;
				} else {
					consonants++;
				}
			} else if (Character.isWhitespace(ch)) {
				spaces++;
			}
		}

		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
		System.out.println("Number of spaces: " + spaces);
	}

	public static boolean isVowel(char ch) {
		return "aeiou".indexOf(ch) != -1;
	}
}
