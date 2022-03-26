package com.tutai.exp.lambda;
/**
 * @author tkd
 */
public class ThisReferenceExample {

	public static void main(String[] args) {

		ThisReferenceExample example = new ThisReferenceExample();

		// Old Way
		example.doProcess(100, new Process() {

			@Override
			public void process(int i) {
				System.out.println(i);
				System.out.println(this);

			}

			@Override
			public String toString() {
				return "This is anonymous inner class";
			}
		});

		// Static method can not use this
		// example.doProcess(0, i -> System.out.println(this + " " + i));
	}

	public ThisReferenceExample() {
		// this method does not chnage line inner class.. i is the same this
		doProcess(0, i -> System.out.println(this + " " + i));

	}

	public void doProcess(int i, Process p) {
		p.process(i);
	}
}
