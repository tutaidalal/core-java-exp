package com.tutai.ds.graph;

import java.util.LinkedList;

public class GNode {

	String name;
	int index;
	boolean visited;
	LinkedList<GNode> neighbours = new LinkedList<GNode>();

	public GNode(String name, int index) {
		super();
		this.name = name;
		this.index = index;
	}

	@Override
	public String toString() {
		return "[" + name +  "]";
	}
}
