package com.tutai.exp.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.tutai.exp.lambda.Student;

public class StreamAPIs {

	public StreamAPIs() {

		List<Integer> numberList = IntStream.range(1, 11).boxed().collect(Collectors.toList());
		List<Student> studentList = Arrays.asList(new Student(1, 10, "Tutai"), new Student(2, 20, "Arpan"),
				new Student(3, 40, "Kriti"), new Student(4, 40, "NandRoy"), new Student(40, 20, "NandRoy"),
				new Student(5, 50, "Arijit"));

		System.out.println(numberList + ", Type - " + numberList.getClass());
		System.out.println(studentList + ", Type - " + studentList.getClass());

		/* Simple List Iteration and print */
		numberList.stream().forEach(System.out::print);
		
		
		System.out.println("-Parallel Stream-");
		numberList.parallelStream().forEach(System.out::println);
		System.out.println("-Parallel Stream-");
		

		/* List to Map With Function Identity */
		Map<Integer, Student> studentMap = studentList.stream()
				.collect(Collectors.toMap(Student::getRoll, Function.identity()));
		System.out.println(studentMap + ", Type - " + studentMap.getClass());

		/* List to map with medthod reference */
		Map<Integer, String> studentMapWithName = studentList.stream()
				.collect(Collectors.toMap(Student::getRoll, Student::getName));
		System.out.println(studentMapWithName + ", Type - " + studentMapWithName.getClass());

		/* List to map with medthod reference */
		Map<Integer, String> linkedMap = studentList.stream()
				.collect(Collectors.toMap(Student::getRoll, Student::getName, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(linkedMap + ", Type - " + linkedMap.getClass());

		Map<String, Integer> treeMap = studentList.stream()
				.collect(Collectors.toMap(Student::getName, Student::getMarks, (e1, e2) -> e2, TreeMap::new));
		System.out.println(treeMap + ", Type - " + treeMap.getClass());

	}

	public static void main(String[] args) {
		new StreamAPIs();
	}

}
