package ArrayPrograms;

import java.util.Scanner;

public class LargestElementInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int largest = findLargest(arr);

		System.out.println("The largest element in the array is: " + largest);
		scanner.close();
	}

	public static int findLargest(int[] arr) {
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		return largest;
	}
}
