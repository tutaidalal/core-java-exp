package com.tutai.algo.recursive;

public class SumOFDigit {

	private static int sumOFDigit(int number) {
		if (number == 0) {
			return 0;
		}
		return (number % 10) + sumOFDigit(number / 10);
	}
	
	public static void main(String[] args) {
		System.out.println(sumOFDigit(123));
	}
	
}
