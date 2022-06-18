package com.tutai.algo.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Start         First           Second
//1 2 3 4       2  3  4  5      3  4  5  6
//12 1 2 5  ->   1  2  3  6 ->   2  3  4  7
//11 4 3 6      12  1  4  7      1  2  1  8
//10 9 8 7      11 10  9  8     12 11 10  9


//1, 2, 3, 4, 12, 1, 2, 5, 11, 4, 3, 6, 10, 9, 8 7
//

public class MatrixLayerRotation {

	public static void matrixRotation(List<List<Integer>> matrix, int r) {
		matrix.forEach(x -> System.out.println(x));
		List<List<Integer>> circles = new ArrayList<List<Integer>>();
		int rowCount = matrix.size();
		int colCount = matrix.get(0).size();
		
		int circleCount = Math.min(rowCount/2, colCount/2);
//		for (int circleDepth = 0; circleDepth < circleCount; circleDepth++) {
//			List<Integer> circleElemnt = new ArrayList<Integer>();
//			for (int rowIndex = circleCount; rowIndex < rowCount-circleDepth; rowIndex++) {
//				if ()
//			}
//		}
//		
		
		
	}

	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		List<Integer> row1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> row2 = Arrays.asList(12, 1, 2, 5);
		List<Integer> row3 = Arrays.asList(11, 4, 3, 6);
		List<Integer> row4 = Arrays.asList(10, 9, 8, 7);

		matrix.add(row1);
		matrix.add(row2);
		matrix.add(row3);
		matrix.add(row4);
		matrixRotation(matrix, 1);
	}

}
