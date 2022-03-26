package com.tutai.exp.lambda;

/**
 * @author tkd
 */
public class ColsuresExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20; // -->Effectively final in java 8

		// Inner class
		doProcess(a, new Process() {
			@Override
			public void process(int i) {
				// TODO Auto-generated method stub
				System.out.println(i + b);
			}
		});

		// Clossure FROZEN the value
		doProcess(a, (i) -> System.out.println(i + b * 2));

	}

	// How it is geting b.. b is an method variable
	static void doProcess(int a, Process p) {
		p.process(a);
	}
}

interface Process {
	void process(int i);
}
