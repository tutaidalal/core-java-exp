package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author tutai
 *
 */
public class SimpleGraphAdjucentMatrix {

	List<GNode> nodeList = new ArrayList<GNode>();
	int[][] adjucentMatrix;

	public SimpleGraphAdjucentMatrix(ArrayList<GNode> nodeList) {
		this.nodeList = nodeList;
		adjucentMatrix = new int[nodeList.size()][nodeList.size()];
	}

	public void addUndirectedEdge(int i, int j) {
		adjucentMatrix[i][j] = 1;
		adjucentMatrix[j][i] = 1;
	}

	public void printGraph() {
		for (int i = 0; i < adjucentMatrix.length; i++) {
			System.out.println(Arrays.toString(adjucentMatrix[i]));
		}
	}

	public static void main(String[] args) {
		ArrayList<GNode> nodeList = new ArrayList<GNode>();
		nodeList.add(new GNode("A", 0));
		nodeList.add(new GNode("B", 1));
		nodeList.add(new GNode("C", 2));
		nodeList.add(new GNode("D", 3));
		nodeList.add(new GNode("E", 4));
		SimpleGraphAdjucentMatrix graph = new SimpleGraphAdjucentMatrix(nodeList);

		graph.addUndirectedEdge(0, 1);
		graph.addUndirectedEdge(0, 2);
		graph.addUndirectedEdge(0, 3);
		graph.addUndirectedEdge(1, 4);
		graph.addUndirectedEdge(2, 3);
		graph.addUndirectedEdge(3, 4);
		graph.printGraph();
	}

}
