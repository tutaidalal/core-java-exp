package com.tutai.ds.tree;

/**
 * @author tkd
 */
public class BNode {
	int value;
	BNode left;
	BNode right;

	public BNode(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		String leftVal = left == null ? null : "" + left.value;
		String rightVal = right == null ? null : "" + right.value;
		return " SNode[" + value + ", L= " + leftVal + ", R= " + rightVal + "]";
	}

	public void printNode(int depth) {
		String padding = new String();
		for (int i = 0; i < depth; i++) {
			padding = padding + "  ";
		}
		System.out.println(padding + value);
		if (left != null) {
			left.printNode(depth + 1);
		}
		if (right != null) {
			right.printNode(depth + 1);
		}
	}
}
