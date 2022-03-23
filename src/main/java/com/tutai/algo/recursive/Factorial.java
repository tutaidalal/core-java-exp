package com.tutai.algo.recursive;

public class Factorial {
	
	
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	private static int factorial(int i) {
		if (i < 1) return -1;
		if (i == 0 || i == 1) {
			return 1;
		}
		return i * factorial(i-1);
	}

}
