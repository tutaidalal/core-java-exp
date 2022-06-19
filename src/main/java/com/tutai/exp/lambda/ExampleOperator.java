package com.tutai.exp.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExampleOperator {

	
	public static void main(String[] args) {
		 // BiFunction
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result = func.apply(2, 3);
        System.out.println(result); // 5

        // BinaryOperator
        BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
        Integer result2 = func.apply(2, 3);
        System.out.println(result2); // 5
        
        
        
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        result = math(Arrays.asList(numbers), 0, (a, b) -> a + b);
        System.out.println(result); // 55
        result2 = math(Arrays.asList(numbers), 0, Integer::sum);
        System.out.println(result2); // 55
        
        
	}
	
	
	public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
        T result = init;
        for (T t : list) {
            result = accumulator.apply(result, t);
        }
        return result;
    }
}
