package com.tutai.bitmagic;

public class OpositeSign {

	public static String toBinaryString(int n) {
		return String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0");
	}

	public static void main(String[] args) {
		int x = 4;
		int y = -8;

		System.out.println(x + " in binary is " + toBinaryString(x));
		System.out.println(y + " in binary is " + toBinaryString(y));
		
		System.out.println(x + " in binary is " + toBinaryString(x));
		

		// true if `x` and `y` have opposite signs
		boolean isOpposite = ((x ^ y) < 0);

		if (isOpposite) {
			System.out.println(x + " and " + y + " have opposite signs");
		} else {
			System.out.println(x + " and " + y + " don't have opposite signs");
		}
	}
}
