package com.tutai.exp.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ShortingUsingLambda {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<Person>(10);
		for (int i = 0; i < 10; i++) {
			personList.add(new Person("Person_" + (20 - i), i, "Khirpai_" + i));
		}

		System.out.println(personList);
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("After Shorting");
		System.out.println(personList);

		Comparator<Person> comparator = (o1, o2) -> o1.getAddress().compareTo(o2.getAddress());

		Collections.sort(personList, (o1, o2) -> o1.getAddress().compareTo(o2.getAddress()));
		System.out.println("After Shorting");
		System.out.println(personList);

//		printSome(personList, p -> p.getAddress().endsWith("1"));

		System.out.println("Print all with a default condiion true");
		performWithFilter(personList, p -> p.getAddress().endsWith("1"), System.out::println);

	}

	interface Condition {
		boolean match(Person p);
	}

	// Use of consumer
	private static void performWithFilter(List<Person> personList, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Iterator iterator = personList.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			if (predicate.test(person)) {
				consumer.accept(person);
			}

		}
	}

}
