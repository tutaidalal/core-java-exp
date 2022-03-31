package graph;

import java.util.ArrayList;

/**
 * @author tutai
 */
public class SimpleGraphAdjucentList {

	ArrayList<GNode> nodeList = new ArrayList<GNode>();

	public SimpleGraphAdjucentList(ArrayList<GNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addUndirectedEdge(int i, int j) {
		GNode startNode = nodeList.get(i);
		GNode endNode = nodeList.get(j);
		startNode.neighbours.add(endNode);
		endNode.neighbours.add(startNode);

//		System.out.println("Start: " + startNode + ", End: " + endNode );
//		printGraph();
	}

	public void printGraph() {
		for (GNode node : nodeList) {
			System.out.println(node + "->" + node.neighbours);
		}
	}

	public static void main(String[] args) {
		ArrayList<GNode> nodeList = new ArrayList<GNode>();
		nodeList.add(new GNode("A", 0));
		nodeList.add(new GNode("B", 1));
		nodeList.add(new GNode("C", 2));
		nodeList.add(new GNode("D", 3));
		nodeList.add(new GNode("E", 4));
		SimpleGraphAdjucentList graph = new SimpleGraphAdjucentList(nodeList);

		graph.addUndirectedEdge(0, 1);
		graph.addUndirectedEdge(0, 2);
		graph.addUndirectedEdge(0, 3);
		graph.addUndirectedEdge(1, 4);
		graph.addUndirectedEdge(2, 3);
		graph.addUndirectedEdge(3, 4);
		graph.printGraph();
	}

}
