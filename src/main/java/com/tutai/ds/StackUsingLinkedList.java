package com.tutai.ds;

/**
 * @author tkd
 */
public class StackUsingLinkedList {

	private SNode top = null;

	public StackUsingLinkedList() {
		push(1);
		push(2);
		push(3);
		printNodes();
		pop();
		printNodes();
	}

	private void push(int value) {
		SNode newNode = new SNode(value);
		newNode.next = top;
		top = newNode;
	}

	private void pop() {
		if (top == null) {
			System.out.println("\nStack is empty");
			return;
		}
		top = top.next;
	}

	private void printNodes() {
		SNode curentNode = top;
		System.out.println("\n");
		while (curentNode != null) {
			System.out.print(curentNode);
			curentNode = curentNode.next;
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
	}

}
