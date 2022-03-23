package com.tutai.ds;

import java.util.HashSet;
import java.util.Set;
/**
 * @author tkd
 */
public class RemoveDuplicateFromList {

	private SNode base = null, top = null;

	public RemoveDuplicateFromList() {
		for (int i = 1; i <= 10; i++) {
			push(i);
			if (i % 4 == 0) {
				push(i / 2);
			}
		}
		printNodes();
		removeDuplicate();
		printNodes();

	}

	private void removeDuplicate() {
		Set<Integer> uniqueSet = new HashSet<Integer>();
		SNode current = base;
		SNode previous = null;
		if (current == null)
			return;

		while (current != null) {
			if (uniqueSet.add(current.value)) {
				previous = current;
				System.out.println(uniqueSet);
			} else {
				previous.next = current.next;
			}
			current = current.next;
		}
	}

	private void push(int value) {
		SNode newNode = new SNode(value);

		if (base == null) {
			base = top = newNode;
			return;
		}
		top.next = newNode;
		top = newNode;
	}

	private void pop() {
		if (base == null) {
			System.out.println("Stack is empty");
			return;
		}
		base = base.next;
	}

	private void printNodes() {
		System.out.println("\n");
		SNode curentNode = base;
		while (curentNode != null) {
			System.out.print(curentNode);
			curentNode = curentNode.next;
		}
	}

	public static void main(String[] args) {
		new RemoveDuplicateFromList();
	}
}
