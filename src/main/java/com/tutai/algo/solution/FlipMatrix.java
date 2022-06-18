package com.tutai.algo.solution;

import java.util.List;

public class FlipMatrix {
	public static int flippingMatrix(List<List<Integer>> matrix) {
		// Write your code here
		int rawSize = matrix.size();
		int colSize = matrix.get(0).size();
		int sum = 0;

		for (int i = 0; i < rawSize / 2; i++) {
			for (int j = 0; j < colSize / 2; j++) {
				int r1 = i;
				int r2 = rawSize - i - 1;
				int c1 = j;
				int c2 = colSize - j - 1;
				sum += Math.max(Math.max(matrix.get(r1).get(c1), matrix.get(r1).get(c2)),
						Math.max(matrix.get(r2).get(c1), matrix.get(r2).get(c2)));
			}
		}
		return sum;
	}
}
