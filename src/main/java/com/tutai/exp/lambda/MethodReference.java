package com.tutai.exp.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author tkd
 */
public class MethodReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Ashoke", "Tutai", "Tishan");
		nameList.forEach(System.out::println);

		List<Student> studentList = Arrays.asList(new Student(1, 99), new Student(2, 98), new Student(3, 97));
		Map<Integer, Integer> map = studentList.stream().collect(Collectors.toMap(Student::getRoll, Student::getMarks));
		System.out.println(map);

		Map<Integer, Student> map1 = studentList.stream()
				.collect(Collectors.toMap(Student::getRoll, Function.identity()));
		System.out.println(map1);

	}
}
