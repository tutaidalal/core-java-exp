package com.tutai.algo.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubSet {

	public static void main(String[] args) {
		findAllSubList(Arrays.asList(1, 2, 3));
	}

	private static ArrayList<ArrayList<Integer>> findAllSubList(List<Integer> A) {
		int totalSubSet = (int) Math.pow(A.size(), 2);
		ArrayList<ArrayList<Integer>> allSubSet = new ArrayList<ArrayList<Integer>>();
		for (int bitMaskValue = 0; bitMaskValue < totalSubSet; bitMaskValue++) {
			ArrayList<Integer> sublist = new ArrayList<Integer>();
			for (int elementIndex = 0; elementIndex < A.size(); elementIndex++) {
				// 00000001 & 00000001
				// 00000001 & 00000010

				// 00000011 && 00000001
				// 00000011 && 00000010
				// 00000011 && 00000100

				if ((bitMaskValue & (1 << elementIndex)) != 0) {
					sublist.add(A.get(elementIndex));
				}

			}
			if (sublist.isEmpty())
				continue;
			allSubSet.add(sublist);
		}
		return allSubSet;
	}
}
