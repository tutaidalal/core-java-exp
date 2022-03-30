package com.tutai.exp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.tutai.exp.lambda.Student;

/**
 * @author tkd
 */
public class StreamAPIs2 {

	public StreamAPIs2() {

		List<Integer> numberList = IntStream.range(1, 11).boxed().collect(Collectors.toList());
		List<Student> studentList = Arrays.asList(new Student(1, 10, "Tutai"), new Student(2, 20, "Arpan"),
				new Student(3, 40, "Kriti"), new Student(4, 40, "NandRoy"), new Student(40, 20, "NandRoy"),
				new Student(4, 50, "Tutai"), new Student(5, 50, "Arijit"));

		Optional<Student> s = studentList.stream().filter(p -> p.getMarks() >= 50).findFirst();
		System.out.println(s.isPresent());

		List<Student> subList = studentList.stream().filter(p -> p.getMarks() >= 50).collect(Collectors.toList());
		System.out.println(subList);
		
		long count = studentList.parallelStream().filter(p -> p.getMarks() >= 30).count();
		System.out.println(count);
		
		
		
	}

	public static void main(String[] args) {
		new StreamAPIs2();
	}

}
