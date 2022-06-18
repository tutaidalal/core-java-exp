package com.tutai.oops.staticp;

//Class 1
	// Helper class
	class Test {

		// Case 1: Static variable
		static int i;
		// Case 2: non-static variables
		int j;

		// Case 3: Static block
		// Start of static block
		static {
			i = 10;
			System.out.println("static block called ");
		}
		// End of static block
	}
	
public class StaticBlock {
	// Java Program to Illustrate How Static block is Called
	// Class 2
	// Main class

	// Main driver method
	public static void main(String args[]) {

		// Although we don't have an object of Test, static
		// block is called because i is being accessed in
		// following statement.
		int a = Test.i;
		System.out.println(10);
	}

}
