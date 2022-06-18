package com.tutai.oops.staticp;

public class ExcepttaionInStatic2 {

	static int i, j;
	static {
		System.out.println("In the static block-2");
		try {
			i = 0;
			j = 10 / i;
		} catch (Exception e) {
			System.out.println("Exception while initializing" + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
	}

}
