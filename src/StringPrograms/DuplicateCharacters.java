package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		printDuplicateCharacters(input);

		scanner.close();
	}

	public static void printDuplicateCharacters(String str) {
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Count occurrences of each character
		for (char ch : str.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		// Print characters that occur more than once
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}
