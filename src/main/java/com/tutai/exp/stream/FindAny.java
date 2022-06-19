package com.tutai.exp.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindAny {
	
	public static void main(String[] args) {
		// Creating an IntStream
	    IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16)
	                       .parallel();
	      
	    // Using Stream findAny(). 
	    // Executing the source code multiple times
	    // may not return the same result.
	    // Every time you may get a different 
	    // Integer which is divisible by 4.
	    stream = stream.filter(i -> i % 4 == 0);
	  
	    OptionalInt answer = stream.findAny();
	    if (answer.isPresent()) 
	    {
	        System.out.println(answer.getAsInt());
	    }
	}

}
