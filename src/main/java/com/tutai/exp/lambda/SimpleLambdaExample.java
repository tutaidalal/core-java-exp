package com.tutai.exp.lambda;

public class SimpleLambdaExample {

	@FunctionalInterface
	interface MyPrinter {
		void print(String str);
	}

	@FunctionalInterface
	interface Math {
		int perform(int a, int b);
	}

	public static void main(String[] args) {

		MyPrinter printer = str -> System.out.println(str);
		printer.print("Hello");

		Math add = (a, b) -> a + b;
		System.out.println(add.perform(1, 2));

		Math divide = (a, b) -> {
			if (b == 0) {
				return 0;
			} else {
				return a / b;
			}
		};

		System.out.println(divide.perform(10, 2));
		System.out.println(divide.perform(10, 0));

	}
}
