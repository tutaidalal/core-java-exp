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
		SNode newNode = new SNode();
		newNode.next = top;
		newNode.value = value;
		top = newNode;
	}

	private void pop() {
		if (top == null) {
			System.out.println("Stack is empty");
			return;
		}
		top = top.next;
	}

	private void printNodes() {
		SNode curentNode = top;
		System.out.println("-----------");
		while (curentNode != null) {
			System.out.println(curentNode.value);
			curentNode = curentNode.next;
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
	}

}
