package com.tutai.exp.lambda;
/**
 */
import java.util.Arrays;
import java.util.List;
/**
 * @author tkd
 */
public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		list.forEach(i -> System.out.println(i));
	}
}
