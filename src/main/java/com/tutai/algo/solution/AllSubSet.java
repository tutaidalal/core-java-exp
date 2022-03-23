package com.tutai.algo.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubSet {

	public static void main(String[] args) {
		findAllSubList(Arrays.asList(1, 2, 3));
	}

	private static void findAllSubList(List<Integer> list) {
		int totalSubSet = (int) Math.pow(list.size(), 2);
		for (int bitMaskValue = 0; bitMaskValue < totalSubSet; bitMaskValue++) {
			List<Integer> sublist = new ArrayList<Integer>();
			for (int elementIndex = 0; elementIndex < list.size(); elementIndex++) {
				// 00000001 & 00000001
				// 00000001 & 00000010

				// 00000011 && 00000001
				// 00000011 && 00000010
				// 00000011 && 00000100

				if ((bitMaskValue & (1 << elementIndex)) != 0) {
					sublist.add(list.get(elementIndex));
				}

			}
			if (sublist.isEmpty())
				continue;
			System.out.println(sublist);
		}
	}
}
