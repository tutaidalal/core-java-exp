package com.tutai.algo.solution;

import java.util.Arrays;

public class EqualArray {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 9, 10, 11, 80, -100, 74 };
		EqualArray.process(arr);
	}

	private static boolean isEqual(int[] arr) {
		//TODO - can be checked from adjucent also
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result = result ^ arr[i];
		}
		return result == 0;
	}

	private static void process(int[] arr) {
		System.out.println(Arrays.toString(arr));
		while(!isEqual(arr)) {
			arr = EqualArray.arrange(arr);
			System.out.println(Arrays.toString(arr));
			for (int i = 1; i < arr.length; i++) {
				arr[i] = arr[i]+1; 
			}
		}
		System.err.println(Arrays.toString(arr));
	}
	
	private static int[] arrange(int[] arr) {
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		if (maxIndex != 0) {
			int tmp  = arr[0];
			arr[0] = arr[maxIndex];
			arr[maxIndex] = tmp;
		}
		return arr;
	}

}