package com.tutai.bitmagic;

public class PowerOfTwo {

	public static void main(String[] args) {
		int input = 8;
		int result = input & (input - 1);

		System.out.println("Input " + input + " B[" + Integer.toBinaryString(input) + "] Result: " + result + " B["
				+ Integer.toBinaryString(result) + "]");

		if (result == 0) {
			System.out.println("Power Of 2");
		} else if (result == 0) {
			System.out.println("NotPower Of 2");
		}
	}

}
