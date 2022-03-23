package com.tutai.algo.recursive;

public class GCD {

	
	
	public static void main(String[] args) {
		int gcd  = gcd(6, 15);
		System.out.println(gcd);
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
