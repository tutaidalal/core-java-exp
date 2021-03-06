package com.tutai.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author tkd
 */
public class BinaryTree {

	private BNode root;

	public BinaryTree() {
		root = new BNode(1);
		
		for (int i = 2; i <= 11; i++) {
			insert(i);
		}

//		root.left = new BNode(2);
//		root.right = new BNode(3);
//
//		root.left.left = new BNode(4);
//		root.left.right = new BNode(5);
//
//		root.right.left = new BNode(6);
//		root.right.right = new BNode(7);
//
//		root.left.left.left = new BNode(8);
//		root.left.left.right = new BNode(9);
//
//		root.left.right.left = new BNode(10);
//		root.left.right.right = new BNode(11);

		root.printNode(0, "R:");

		System.out.println("\nPre-Order: ");
		printPreorder(root);
		System.out.println("\nIn-Order: ");
		printInorder(root);
		System.out.println("\nPost-Order: ");
		postOrder(root);
		System.out.println("\nLevel-Order: ");
		levelOrder(root);
		System.out.println("\n");
		seach(10);
		seach(99);

	}

	private void printPreorder(BNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + ",");
		printPreorder(node.left);
		printPreorder(node.right);
	}

	private void printInorder(BNode node) {
		if (node == null) {
			return;
		}
		printInorder(node.left);
		System.out.print(node.value + ",");
		printInorder(node.right);
	}

	private void postOrder(BNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + ",");
	}

	private void levelOrder(BNode node) {
		Queue<BNode> queue = new LinkedList<BNode>();
		queue.add(node);
		while (!queue.isEmpty()) {
			BNode currentNode = queue.remove();
			System.out.print(currentNode.value + ",");
			if (currentNode.left != null)
				queue.add(currentNode.left);
			if (currentNode.right != null)
				queue.add(currentNode.right);
		}
	}
	
	private void seach(int value) {
		Queue<BNode> queue = new LinkedList<BNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BNode currentNode = queue.remove();
			if (currentNode.value == value) { 
				System.out.println("Value is Found : " + value);
				return;
			}
			if (currentNode.left != null)
				queue.add(currentNode.left);
			if (currentNode.right != null)
				queue.add(currentNode.right);
		}
		System.out.println("Value not Found : " + value);
	}
	
	private void insert(int value) {
		Queue<BNode> queue = new LinkedList<BNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BNode currentNode = queue.remove();
			if (currentNode.left == null) {
				currentNode.left = new BNode(value);
				return;
			}
			else if (currentNode.right == null) {
				currentNode.right = new BNode(value);
				return;
			}
			else {
				queue.add(currentNode.left);
				queue.add(currentNode.right);
			}
		}
		System.out.println("Value not Found : " + value);
	}
	
	public static void main(String[] args) {
		new BinaryTree();
	}

}
