package com.tutai.algo.sort;

import java.util.Arrays;

/**
 * @author tkd
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] numbers = { 6, 5, 12, 10, 9, 1 };
		mergeSort(numbers, 0, numbers.length - 1);
		System.out.println("After Sort: " + Arrays.toString(numbers));
	}

	/**
	 * @param numbers
	 * @param startIndex
	 * @param endIndex
	 */
	private static void mergeSort(int[] numbers, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int mid = (startIndex + endIndex) / 2;
			mergeSort(numbers, startIndex, mid);
			mergeSort(numbers, mid + 1, endIndex);
			merge(numbers, startIndex, mid, endIndex);
		}
	}

	/**
	 * @param numbers
	 * @param startIndex
	 * @param mid
	 * @param endIndex
	 */
	private static void merge(int[] numbers, int startIndex, int mid, int endIndex) {

		int leftArrLen = mid - startIndex + 1;
		int rightArrLength = endIndex - mid;

		int[] leftArray = new int[leftArrLen];
		for (int i = 0; i < leftArrLen; i++) {
			leftArray[i] = numbers[startIndex + i];
		}

		int[] rightArray = new int[rightArrLength];
		for (int i = 0; i < rightArrLength; i++) {
			rightArray[i] = numbers[mid + i + 1];
		}

		int leftIndex = 0;
		int rightIndex = 0;
		int mainIndex = startIndex;

		while (leftIndex < leftArrLen && rightIndex < rightArrLength) {
			if (leftArray[leftIndex] <= rightArray[rightIndex]) {
				numbers[mainIndex] = leftArray[leftIndex];
				leftIndex++;
			} else {
				numbers[mainIndex] = rightArray[rightIndex];
				rightIndex++;
			}
			mainIndex++;
		}

		/* Copy remaining elements of L[] if any */
		while (leftIndex < leftArrLen) {
			numbers[mainIndex] = leftArray[leftIndex];
			leftIndex++;
			mainIndex++;
		}

		/* Copy remaining elements of R[] if any */
		while (rightIndex < rightArrLength) {
			numbers[mainIndex] = rightArray[rightIndex];
			rightIndex++;
			mainIndex++;
		}

	}

}
