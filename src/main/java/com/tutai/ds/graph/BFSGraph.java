package com.tutai.ds.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author tkd
 *
 */
public class BFSGraph {
	ArrayList<GNode> nodeList = new ArrayList<GNode>();

	public BFSGraph(ArrayList<GNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addUndirectedEdge(int i, int j) {
		GNode startNode = nodeList.get(i);
		GNode endNode = nodeList.get(j);
		startNode.neighbours.add(endNode);
		endNode.neighbours.add(startNode);
	}

	public void printGraph() {
		for (GNode node : nodeList) {
			System.out.println(node + "->" + node.neighbours);
		}
	}

	public void clearVisit() {
		for (GNode node : nodeList) {
			node.visited = false;
		}
	}

	public void doBFS() {
		Queue<GNode> queue = new LinkedList<GNode>();
		queue.add(nodeList.get(3));

		while (!queue.isEmpty()) {
			GNode poppedElement = queue.poll();
			poppedElement.visited = true;
			System.out.print("\nPath for Node [" + poppedElement.name + "] ");
			printPath(poppedElement);
			for (GNode neighbour : poppedElement.neighbours) {
				if (!neighbour.visited) {
					queue.add(neighbour);
					neighbour.visited = true;
					neighbour.parent = poppedElement;
				}
			}
		}
	}

	public void doBFS(GNode node) {
		Queue<GNode> queue = new LinkedList<GNode>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GNode poppedElement = queue.poll();
			poppedElement.visited = true;
			System.out.print("\nPath for Node [" + poppedElement.name + "] ");
			printPath(poppedElement);
			for (GNode neighbour : poppedElement.neighbours) {
				if (!neighbour.visited) {
					queue.add(neighbour);
					neighbour.visited = true;
					neighbour.parent = poppedElement;
				}
			}
		}
	}

	private void printPath(GNode currentNode) {
		if (currentNode.parent != null) {
			printPath(currentNode.parent);
			System.out.print(currentNode.name + " ");
		}
	}

	public static void main(String[] args) {
		ArrayList<GNode> nodeList = new ArrayList<GNode>();
		nodeList.add(new GNode("A", 0));
		nodeList.add(new GNode("B", 1));
		nodeList.add(new GNode("C", 2));
		nodeList.add(new GNode("D", 3));
		nodeList.add(new GNode("E", 4));

		nodeList.add(new GNode("F", 5));
		nodeList.add(new GNode("G", 6));
		BFSGraph graph = new BFSGraph(nodeList);

		graph.addUndirectedEdge(0, 1);
		graph.addUndirectedEdge(0, 2);

		graph.addUndirectedEdge(1, 6);
		graph.addUndirectedEdge(1, 3);

		graph.addUndirectedEdge(2, 3);
		graph.addUndirectedEdge(2, 4);

		graph.addUndirectedEdge(3, 5);
		graph.addUndirectedEdge(4, 5);

		graph.addUndirectedEdge(5, 6);

		graph.printGraph();

		graph.doBFS(nodeList.get(0));
//		graph.clearVisit();
//		graph.doBFS();
	}

}
