package com.tutai.algo.recursive;

public class DecimalToBinary {

	
	public static void main(String[] args) {
		decimalToBinary(10);
	}

	private static void decimalToBinary(int i) {
		if (i == 0)
			return;
		decimalToBinary(i/2);
		System.out.print(i%2);
	}
}
