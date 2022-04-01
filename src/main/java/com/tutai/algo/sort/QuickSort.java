package sort;

import java.util.Arrays;

public class QuickSort {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static int partition(int[] numbers, int low, int high) {
		int pivot = numbers[high];
		int leftP = (low - 1);

		for (int rightP = low; rightP <= high - 1; rightP++) {
			if (numbers[rightP] < pivot) {
				leftP++;
				swap(numbers, leftP, rightP);
			}
		}
		swap(numbers, leftP + 1, high);
		return (leftP + 1);

	}

	public static void main(String[] args) {
		int[] numbers = { 10, 80, 30, 90, 40, 50, 70};
		quickSort(numbers, 0, numbers.length - 1);
		System.out.println("After Sort: " + Arrays.toString(numbers));
	}

	private static void quickSort(int[] numbers, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(numbers, low, high);
			quickSort(numbers, low, partitionIndex - 1);
			quickSort(numbers, partitionIndex + 1, high);
		}

	}

}
