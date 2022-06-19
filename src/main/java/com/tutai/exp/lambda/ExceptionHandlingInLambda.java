package com.tutai.exp.lambda;

import java.util.function.BiConsumer;

/**
 * @author tkd
 */
public class ExceptionHandlingInLambda {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 10, 12 };
		int key = 2;

		// Lambda should be really small ( Ectern to diff function )
		doProcess(numbers, key, wraperLambda((a, b) -> System.out.println(a / b)));

		// Not an good idea.
		System.out.println("Bad Idea");
		doProcess(numbers, key, (a, b) -> {
			try {
				System.out.println(a / b);
			} catch (Exception e) {
				System.out.println(e);
			}
		});

	}

	private static void doProcess(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int member : numbers) {
			consumer.accept(member, key);
		}
	}

	private static BiConsumer<Integer, Integer> wraperLambda(BiConsumer<Integer, Integer> lambda) {
		return (v, k) -> {
			try {
				lambda.accept(v, k);
			} catch (Exception e) {
				System.out.println("" + e);
			}
		};
	}

}
