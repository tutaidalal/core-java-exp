package com.tutai.oops.staticp;

public class StaticInterfaceMethod {

	
	public static void main(String[] args) {
		MyInterface.print();
	}
	
	interface MyInterface {
		static void print() {
			System.out.println("Hello");
		}
	}
}
