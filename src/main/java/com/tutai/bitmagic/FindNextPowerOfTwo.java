package com.tutai.bitmagic;

public class FindNextPowerOfTwo {
	public static void main(String[] args) {
		int n = 128;
		// decrement `n` (to handle cases when `n` itself
		// is a power of 2)
		n = n - 1;

		// initialize result by 2
		int k = 2;

		// double `k` and divide `n` in half till it becomes 0
		while ((n >>= 1) != 0) {
			k = k << 1; // double `k`
		}

		System.out.println("k=" + k);

	}
}
