package sort;

import java.util.Arrays;

//Iteration [0]: [9, 8, 7, 6, 5, 4, 3, 2, 1, 10]
//Iteration [1]: [8, 7, 6, 5, 4, 3, 2, 1, 9, 10]
//Iteration [2]: [7, 6, 5, 4, 3, 2, 1, 8, 9, 10]
//Iteration [3]: [6, 5, 4, 3, 2, 1, 7, 8, 9, 10]
//Iteration [4]: [5, 4, 3, 2, 1, 6, 7, 8, 9, 10]
//Iteration [5]: [4, 3, 2, 1, 5, 6, 7, 8, 9, 10]
//Iteration [6]: [3, 2, 1, 4, 5, 6, 7, 8, 9, 10]
//Iteration [7]: [2, 1, 3, 4, 5, 6, 7, 8, 9, 10]
//Iteration [8]: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//Iteration [9]: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

/**
 * @author tkd
 *
 */
public class BubbleSort {
	public static void main(String[] args) {

		int[] numbers = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		for (int outerIndex = 0; outerIndex < numbers.length; outerIndex++) {
			for (int innerIndex = 0; innerIndex < numbers.length - outerIndex - 1; innerIndex++) {
				if (numbers[innerIndex] > numbers[innerIndex + 1]) {
					int temp = numbers[innerIndex];
					numbers[innerIndex] = numbers[innerIndex + 1];
					numbers[innerIndex + 1] = temp;
				}
			}
			System.out.println("Iteration [" + outerIndex + "]: " + Arrays.toString(numbers));
		}

	}
}
