package com.tutai.algo.recursive.search;

public class SearchInRotatedSortedArray {

	public static int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2; // (left + right) / 2
			System.out.println("L=> " + left + ", Right=> " + right);

			if (nums[mid] == target)
				return mid;

			// if left to mid is sorted
			if (nums[left] <= nums[mid]) {
				if (nums[left] <= target && nums[mid] > target) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else { // mid to right part is sorted
				if (nums[mid] < target && target <= nums[right]) { // min, max
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}

		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {11, 12, 15, 16, 0, 6, 7, 8, 9, 10};
		System.out.println(SearchInRotatedSortedArray.search(arr, 5));
		
		
		
	}
}
