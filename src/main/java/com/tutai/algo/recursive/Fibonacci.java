package com.tutai.algo.recursive;

public class Fibonacci {
	public static void main(String[] args) {
		int result = fibonacci(7);
		System.out.println(result);
	}

	private static int fibonacci(int i) {
		if (i < 0) {
			return -1;
		}
		if (i == 0 || i == 1) {
			return i;
		}

		return fibonacci(i - 1) + fibonacci(i - 2);
	}
}
