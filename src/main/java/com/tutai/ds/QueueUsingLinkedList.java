package com.tutai.ds;
/**
 * @author tkd
 */
public class QueueUsingLinkedList {

	private SNode base = null;
	private SNode top = null;

	public QueueUsingLinkedList() {
		push(1);
		push(2);
		push(3);
		printNodes();
		pop();
		printNodes();
		pop();
		printNodes();
		pop();
		printNodes();
		pop();
		push(4);
		push(5);
		push(6);
		printNodes();
		pop();
		printNodes();
		
	}

	private void push(int value) {
		SNode newNode = new SNode();
		newNode.value = value;
		
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
		SNode curentNode = base;
		System.out.println("-----------");
		while (curentNode != null) {
			System.out.println(curentNode.value);
			curentNode = curentNode.next;
		}
	}

	public static void main(String[] args) {
		QueueUsingLinkedList ds = new QueueUsingLinkedList();
	}

}
