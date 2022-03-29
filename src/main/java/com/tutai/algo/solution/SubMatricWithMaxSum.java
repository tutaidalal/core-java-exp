package com.tutai.algo.solution;

public class SubMatricWithMaxSum {
	static void maxSubmatrixSum(int[][] matrix) {

		int row = matrix.length;
		int col = matrix[0].length;

		int maxSubmatrix = 0;
		int subStartRow = 0, subStartCol = 0, subEndRow = 0, subEndCol = 0;

		for (int starterRow = 0; starterRow < row; starterRow++) {

			for (int startingCol = 0; startingCol < col; startingCol++) {

				for (int endRow = starterRow; endRow < row; endRow++) {

					for (int endCol = startingCol; endCol < col; endCol++) {

						int sumSubmatrix = 0;

						// Iterate the submatrix
						// row-wise and calculate its sum
						for (int m = starterRow; m <= endRow; m++) {
							for (int n = startingCol; n <= endCol; n++) {
								sumSubmatrix += matrix[m][n];
							}
						}

						if (sumSubmatrix >= maxSubmatrix) {
							maxSubmatrix = sumSubmatrix;
							subStartRow = starterRow;
							subStartCol = startingCol;
							subEndRow = endRow;
							subEndCol = endCol;
						}
					}
				}
			}
		}

		System.out.println("maxSubmatrix=" + maxSubmatrix);
		System.out.println("subStartRow=" + subStartRow);
		System.out.println("subStartCol=" + subStartCol);
		System.out.println("subEndRow=" + subEndRow);
		System.out.println("subEndCol=" + subEndCol);
	}

	// Driver Code
	public static void main(String[] args) {
		int[][] matrix = { { 0, -2, -7, 0 },
				           { 9, 2, -6, 2 },
				           { -4, 1, -4, 1 },
				           { -1, 8, 0, -2 } };
		maxSubmatrixSum(matrix);
	}
}
