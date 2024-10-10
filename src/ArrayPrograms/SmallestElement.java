package ArrayPrograms;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int smallest = findSmallest(arr);

		System.out.println("The smallest element in the array is: " + smallest);
		scanner.close();
	}

	public static int findSmallest(int[] arr) {
		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		return smallest;
	}
}
