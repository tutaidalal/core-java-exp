package com.tutai.bitmagic;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a = 10;
		int k = 3;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(k));
		
		a = a ^ k;
		System.out.println(Integer.toBinaryString(a) + ", "  + a);
		
		k = a ^ k;
		System.out.println(Integer.toBinaryString(k) + ", "  + k);
		
		a = a ^ k;
		System.out.println(Integer.toBinaryString(a) + ", "  + a);
		
	}
}
