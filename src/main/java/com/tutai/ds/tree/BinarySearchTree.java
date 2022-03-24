package com.tutai.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author tkd
 */
public class BinarySearchTree {

	private BNode root;

	public BinarySearchTree() {
		root = new BNode(80);

		insert(root, 70);
		insert(root, 90);
		insert(root, 1);
		insert(root, 3);
		insert(root, 100);
		insert(root, 200);
		insert(root, 150);
		insert(root, 300);
		insert(root, 250);

		root.printNode(0, "R: ");

		System.out.println("Min Value:" + minValue(root));

		root = delete(root, 200);
		root.printNode(0, "R: ");

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

	BNode delete(BNode currentNode, int key) {
		/* Base Case: If the tree is empty */
		if (currentNode == null)
			return currentNode;

		/* Otherwise, recur down the tree */
		if (key < currentNode.value)
			currentNode.left = delete(currentNode.left, key);
		else if (key > currentNode.value)
			currentNode.right = delete(currentNode.right, key);

		// if key is same as root's
		// key, then This is the
		// node to be deleted
		else {
			// node with only one child or no child
			if (currentNode.left == null)
				return currentNode.right;
			else if (currentNode.right == null)
				return currentNode.left;

			// node with two children: Get the inorder
			// successor (smallest in the right subtree)
			currentNode.value = minValue(currentNode.right);
			// Delete the inorder successor
			currentNode.right = delete(currentNode.right, currentNode.value);
		}

		return currentNode;
	}

	int minValue(BNode currentNode) {
		int minv = currentNode.value;
		while (currentNode.left != null) {
			minv = currentNode.left.value;
			currentNode = currentNode.left;
		}
		return minv;
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

	}

	private void insert(BNode currentNode, int value) {
		if (currentNode.value > value) {
			if (currentNode.left == null) {
				currentNode.left = new BNode(value);
			} else {
				insert(currentNode.left, value);
			}
		} else {
			if (currentNode.right == null) {
				currentNode.right = new BNode(value);
			} else {
				insert(currentNode.right, value);
			}
		}
	}

	public static void main(String[] args) {
		new BinarySearchTree();
	}

}
