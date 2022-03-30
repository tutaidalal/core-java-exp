package com.tutai.algo.solution;

public class LinkedListLoopAndBreak {
	// Java program to detect and remove loop in linked list

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// Function that detects loop in the list
	int detectAndRemoveLoop(Node node) {
		Node slow = node, fast = node;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			// If slow and fast meet at same point then loop is present
			if (slow == fast) {
				removeLoop(slow, node);
				return 1;
			}
		}
		return 0;
	}

	// Function to remove loop
	void removeLoop(Node slow, Node head) {
		System.out.println("\nSlow=" + slow.data);
		for (Node curr = head; curr != null; curr = curr.next) {
			Node probbableLast = slow;
			while (probbableLast.next != slow && probbableLast.next != curr) {
				System.out.println("ptr=" + probbableLast.data);
				probbableLast = probbableLast.next;
			}
			System.out.println("Possible Last: " + probbableLast.data + ", Cur " + curr.data);

			if (probbableLast.next == curr) {
				probbableLast.next = null;
				return;
			}
		}

	}

	// Function to print the linked list
	void printList(Node node) {
		int count = 100;
		System.out.println();
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
			if (count == 0) {
				break;
			}
			count--;
		}
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		LinkedListLoopAndBreak list = new LinkedListLoopAndBreak();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);

		// Creating a loop for testing
		list.printList(head);
		head.next.next.next.next.next = head.next.next;
		list.printList(head);

		list.detectAndRemoveLoop(head);
		System.out.println("Linked List after removing loop : ");
		list.printList(head);
	}

	// This code has been contributed by Mayank Jaiswal

}
