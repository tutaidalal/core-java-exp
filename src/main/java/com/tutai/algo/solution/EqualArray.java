package com.tutai.algo.solution;

import java.util.Arrays;

public class EqualArray {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2};
		EqualArray.process(arr);
	}

//	private static boolean isEqual(int[] arr) {
//		int result = 0;
//		for (int i = 0; i < arr.length; i++) {
//			result = result ^ arr[i];
//		}
//		return result == 0;
//	}
	
	private static boolean isEqual(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[0]) return false;
		}
		return true;
	}

	private static void process(int[] arr) {

		// for first time, talking the max to zero position
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		if (maxIndex != 0) {
			int tmp = arr[0];
			arr[0] = arr[maxIndex];
			arr[maxIndex] = tmp;
		}
        
		int loopCount = 1;
		while (!isEqual(arr)) {
			System.out.println(Arrays.toString(arr));
			for (int i = 1; i < arr.length; i++) {
				arr[i] = arr[i] + 1;
				if (arr[0] < arr[i]) {
					int tmp = arr[0];
					arr[0] = arr[i];
					arr[i] = tmp;
				}
			}
			loopCount++;
		}
		System.err.println(Arrays.toString(arr) + ", LoopCount= " + loopCount);
	}
}