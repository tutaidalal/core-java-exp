package sort;

import java.util.Arrays;

//Partition [1]: [9, 10, 8, 7, 6, 5, 4, 3, 2, 1]
//Partition [2]: [8, 9, 10, 7, 6, 5, 4, 3, 2, 1]
//Partition [3]: [7, 8, 9, 10, 6, 5, 4, 3, 2, 1]
//Partition [4]: [6, 7, 8, 9, 10, 5, 4, 3, 2, 1]
//Partition [5]: [5, 6, 7, 8, 9, 10, 4, 3, 2, 1]
//Partition [6]: [4, 5, 6, 7, 8, 9, 10, 3, 2, 1]
//Partition [7]: [3, 4, 5, 6, 7, 8, 9, 10, 2, 1]
//Partition [8]: [2, 3, 4, 5, 6, 7, 8, 9, 10, 1]
//Partition [9]: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
/**
 * @author tkd
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] numbers = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		for (int partitionIndex = 0; partitionIndex < numbers.length; partitionIndex++) {
			int minIndex = partitionIndex;

			for (int unsortedIndex = partitionIndex + 1; unsortedIndex < numbers.length; unsortedIndex++) {
				if (numbers[unsortedIndex] < numbers[minIndex]) {
					minIndex = unsortedIndex;
				}
			}

			int temp = numbers[minIndex];
			numbers[minIndex] = numbers[partitionIndex];
			numbers[partitionIndex] = temp;

			System.out.println("Partition [" + partitionIndex + "]: " + Arrays.toString(numbers));

		}
	}
}
