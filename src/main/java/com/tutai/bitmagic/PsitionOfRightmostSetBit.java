package com.tutai.bitmagic;

public class PsitionOfRightmostSetBit {
	public static void main(String[] args) {
		int input = 10;
		int result = input & (input - 1);

		result = result ^ input;

		System.out.println("Input " + input + " B[" + Integer.toBinaryString(input) + "] Result: " + result + " B["
				+ Integer.toBinaryString(result) + "]");
	}

}
