package com.tutai.oops.binding;

//Java Program to Illustrate Static Binding

//Main class
public class StaticBinding {

	// Static nested inner class
	// Class 1
	public static class superclass {

		// Method of inner class
		public static void print()
		{

			// Print statement
			System.out.println(
				"print() in superclass is called");
		}
	}

	// Static nested inner class
	// Class 2
	public static class subclass extends superclass {

		// Method of inner class
		public static boolean print(int y)
		{
			

			// print statement
			System.out.println(
				"print() in subclass is called");
			return false;
		}
	}

	// Method of main class
	// Main driver method
	public static void main(String[] args)
	{

		// Creating objects of static inner classes
		// inside main() method
		superclass A = new superclass();
		superclass B = new subclass();

		// Calling method over above objects
		A.print();
		B.print();
	}
}
