package com.tutai.exp.lambda;

/**
 * @author tkd
 */
public class SimpleLambdaExample {

	@FunctionalInterface
	interface MyPrinter {
		void print(String str);
	}

	@FunctionalInterface
	interface Math {
		int perform(int a, int b);
	}

	private static void printLambda(MyPrinter printer) {
		printer.print("Hello from printLambda");
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

		printLambda(s -> System.out.println(s));

		System.out.println(divide.perform(10, 2));
		System.out.println(divide.perform(10, 0));

	}
}
