package com.tutai.exp.lambda;
/**
 * @author tkd
 */
public class ThreadWIthLambda {

	public static void main(String[] args) {

		Thread thread = new Thread(() -> System.out.println("Hello World"));
		thread.start();

	}

}
