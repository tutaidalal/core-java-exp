package com.tutai.exp.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.tutai.exp.lambda.Student;

public class SortWithTwoCondition {

	public SortWithTwoCondition() {

		List<Integer> numberList = IntStream.range(1, 11).boxed().collect(Collectors.toList());
		List<Student> studentList = Arrays.asList(new Student(1, 10, "Tutai"), new Student(2, 20, "Arpan"),
				new Student(3, 40, "Kriti"), new Student(4, 40, "NandRoy"), new Student(40, 20, "NandRoy"),
				new Student(4, 50, "Tutai"), new Student(5, 50, "Arijit"));

		studentList.sort((s1, s2) -> {
			int diff = s1.getMarks() - s2.getMarks();
			diff = diff == 0 ? s1.getName().compareTo(s2.getName()) : diff;
			return diff;
		});

		System.out.println(studentList);

		System.out.println("---------");

		studentList.sort((s1, s2) -> {
			int diff = s1.getMarks() - s2.getMarks();
			diff = diff == 0 ? s1.getRoll() - s2.getRoll() : diff;
			return diff;
		});

		System.out.println("======");
		studentList = studentList.stream()
				.sorted(Comparator.comparing(Student::getMarks).thenComparing(Student::getName))
				.collect(Collectors.toList());
		System.out.println(studentList);

	}

	public static void main(String[] args) {
		new SortWithTwoCondition();
	}

}
