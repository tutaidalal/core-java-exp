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
		QueueUsingLinkedList ds = new QueueUsingLinkedList();
	}

}
