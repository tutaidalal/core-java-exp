package com.tutai.exp.stream;

import java.util.stream.Stream;

public class StraemConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating more than two Streams
        Stream<String> stream1 = Stream.of("Geeks", "108");
        Stream<String> stream2 = Stream.of("GeeksQuiz");
        Stream<String> stream3 = Stream.of("GeeksforGeeks");
        Stream<String> stream4 = Stream.of("GFG");
  
        // concatenating all the Streams
        // with Stream.concat() function
        // and displaying the result
        Stream.concat(Stream.concat(Stream.concat(stream1,
                             stream2), stream3), stream4)
            .forEach(element -> System.out.println(element));

        
	}
}
