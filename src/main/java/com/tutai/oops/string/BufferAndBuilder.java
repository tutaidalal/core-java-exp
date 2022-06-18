package com.tutai.oops.string;

/**
 * @author tkd
 */
public class BufferAndBuilder {
	
	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer("TUTAI");
		StringBuffer buffer2 = new StringBuffer("TUTAI");
		
		StringBuilder builder1 = new StringBuilder("DALAL");
		StringBuilder builder2 = new StringBuilder("DALAL");
		
		
		System.out.println(buffer1.equals(buffer2));
		System.out.println(builder1.equals(builder2));
	}

}
