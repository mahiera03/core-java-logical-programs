package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestAndSmallest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		if (n < 2) {
			System.out.println("Second smallest: -1");
			System.out.println("Second largest: -1");
		} else {
			int[] arr = new int[n];
			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}

			Arrays.sort(arr); // Sort the array

			int secondSmallest = findSecondSmallest(arr);
			int secondLargest = findSecondLargest(arr);

			System.out.println("Second smallest: " + secondSmallest);
			System.out.println("Second largest: " + secondLargest);
		}

		scanner.close();
	}

	public static int findSecondSmallest(int[] arr) {
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > smallest) {
				return arr[i];
			}
		}
		return -1; // If second smallest doesn't exist
	}

	public static int findSecondLargest(int[] arr) {
		int largest = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < largest) {
				return arr[i];
			}
		}
		return -1; // If second largest doesn't exist
	}
}
