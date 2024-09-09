package dailyJava;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println("Before sorting: " + Arrays.toString(arr));

		int n = arr.length;

		System.out.print("After Bubble Sorting: ");
		for (int i : binarySearchAlgo(arr, n - 1)) {

			System.out.print(i + " ");
		}

	}

	public static int[] binarySearchAlgo(int[] array, int n) {

		for (int i = 0; i < n; i++) {

			boolean swapped = false;

			for (int j = 0; j < n - i; j++) {

				if (array[j] > array[j + 1]) {

					array[j + 1] = (array[j] + array[j + 1]) - (array[j] = array[j + 1]);

					swapped = true;
				}
			}
			if (!swapped) {

				break;
			}
		}

		return array;
	}

}
