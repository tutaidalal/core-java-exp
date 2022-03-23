package com.tutai.ds;

/**
 * @author tkd
 */
public class CurcularLinkedList {

	private SNode root;
	//, head;

	public CurcularLinkedList() {
		addNode(1);
		addNode(2);
		printNodes();
		printNodes();
		addNode(3);
		addNode(4);
		printNodes();
		deleteNode(1);
		printNodes();
		
	}

	private void deleteNode(int value) {
		
		if (root == null) {
			System.out.println("List is empty");
		}
		
		SNode current = root;
		SNode previous = new SNode(-1);
		
		while(current.value != value) { 
			if (current.next == root) {
				System.out.println("Data Not Found");
				current = null;
				previous = null;
				break;
			}
			previous = current;
			current = current.next;
		}
		
		// Check if node is only node
        if (current == root && current.next == root) {
        	root = null;
            return;
        }
 
        // If more than one node, check if
        // it is first node
        if (current == root) {
        	previous = root;
            while (previous.next != root)
            	previous = previous.next;
            root = current.next;
            previous.next = root;
        } 
 
        // check if node is last node
        else if (current.next == root) {
        	previous.next = root;
        }
        else {
        	previous.next = current.next;
        }
	}
	
	private void addNode(int value) {
		SNode newNode = new SNode(value);
		if (root == null) { 
			root = newNode;
		} else {
			SNode lastNode = root;
			while (lastNode.next != root) {
				lastNode  = lastNode.next;
			}
			lastNode.next = newNode;
		}
		
		newNode.next = root;
	}

//	private void addNode(int value) {
//		SNode newNode = new SNode(value);
//		if (root == null) {
//			root = head = newNode;
//		} else {
//			head.next = newNode;
//			head = newNode;
//		}
//		head.next = root;
//	}

	private void printNodes() {
		SNode curentNode = root;
		System.out.println("\n");
		while (true) {
			if (curentNode == null)
				break;
			System.out.print(curentNode);
			if (curentNode.next == root)
				break;
			curentNode = curentNode.next;
		}
	}

	public static void main(String[] args) {
		new CurcularLinkedList();
	}

}
