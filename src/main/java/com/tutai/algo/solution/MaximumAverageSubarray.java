package com.tutai.algo.solution;

public class MaximumAverageSubarray {

	/**
	 * Input: K = 4, N = 6 Arr[] = {1, 12, -5, -6, 50, 3} Output: 12 -5 -6 50
	 * Explanation: Maximum average is (12 - 5 - 6 + 50)/4 = 51/4.
	 * 
	 * @param arr
	 * @param n
	 * @param k
	 * @return
	 */
	static int findMaxAverage(int[] arr, int n, int k) {
		int avg = Integer.MIN_VALUE;
		int startingIndex = -1;
		for (int i = 0; i < n - k + 1; i++) {
			int tempAvg = arr[i];
			int count = 2;
			for (int j = i+1; j < i + k; j++) {
				int newMember = arr[j];
				tempAvg = tempAvg + ((newMember - tempAvg)/count);
				count++;
			}
			System.out.println(tempAvg);
			tempAvg = tempAvg / k;
			if (tempAvg > avg) {
				avg = tempAvg;
				startingIndex = i;
			}

		}
		System.out.println("startingIndex="+startingIndex);
		return avg;
	}

	public static void main(String[] args) {
		int[] ARR = { 1, 12, -5, -6, 50, 3 };
		System.out.println(findMaxAverage(ARR, ARR.length, 4));
	}

}
