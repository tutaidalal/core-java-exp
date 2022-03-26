package com.tutai.exp.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author tkd
 */
public class OutOfBoxFunctionalInterfaceUse {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>(10);
		for (int i = 0; i < 10; i++) {
			personList.add(new Person("Person_" + (20 - i), i, "Khirpai_" + i));
		}

		printWithFilter(personList, p -> p.getName().endsWith("2"));

		performWithFilter(personList, p -> p.getName().endsWith("2"), p -> System.out.println("-->" + p));

		performWithFilter(personList, p -> p.getName().endsWith("9"), p -> System.out.println(p.getAddress()));
	}

	// Use of Predicate
	private static void printWithFilter(List<Person> personList, Predicate<Person> predicate) {
		for (Iterator iterator = personList.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			if (predicate.test(person)) {
				System.out.println("FIltered-" + person);
			}

		}
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
