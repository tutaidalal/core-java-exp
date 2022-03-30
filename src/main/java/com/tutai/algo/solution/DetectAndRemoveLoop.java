package com.tutai.algo.solution;

public class DetectAndRemoveLoop {
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
		 // Do for each node of the linked list
        for (Node curr = head; curr != null; curr = curr.next)
        {
            // start a pointer `ptr` from the `slow` node and
            // check if it meets the current node `curr`
            Node ptr = slow;
            while (ptr.next != slow && ptr.next != curr) {
                ptr = ptr.next;
            }
 
            // If `ptr` meets `curr`, then that means there is a loop, and `curr`
            // points to the first node of the loop and `ptr` points to the last node
            if (ptr.next == curr)
            {
                // set next pointer of `ptr` to `null` to break the chain
                ptr.next = null;
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
		DetectAndRemoveLoop list = new DetectAndRemoveLoop();
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
