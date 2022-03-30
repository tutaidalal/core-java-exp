package com.tutai.algo.solution;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
/**
 * @author tkd
 */
public class LFUCache {

	private class DNode {
		int key;
		int value;
//		DNode next;
//		DNode prev;
		int count;

		public DNode(int key, int value) {
			this.count = 1;
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "DNode [key=" + key + ", value=" + value + "]";
		}
	}

	private Map<Integer, DNode> valueCache = new HashMap<Integer, DNode>();
	
	/*using Java inked List considering that the delete will be in O(1) for a double linked list*/
	private Map<Integer, LinkedList<DNode>> frequencyMap = new HashMap<Integer, LinkedList<DNode>>();
	private int CAPACITY = 4;
	private int minFrequency = 1;

	public int get(int key) {
		if (!valueCache.containsKey(key)) {
			return -1;
		}

		DNode valueNode = valueCache.get(key);
		frequencyMap.get(valueNode.count).remove(valueNode);

		/* Update the min */
		if (valueNode.count == minFrequency && frequencyMap.get(valueNode.count).size() == 0) {
			minFrequency++;
		}

		valueNode.count = valueNode.count + 1;
		if (!frequencyMap.containsKey(valueNode.count)) {
			frequencyMap.put(valueNode.count, new LinkedList<DNode>());
		}
		frequencyMap.get(valueNode.count).add(0, valueNode);
		printCache();
		return valueNode.value;

	}

	public void put(int key, int value) {
		if (valueCache.containsKey(key)) {
			valueCache.get(key).value = value;
			get(key);
			printCache();
			return;
		}
		if (valueCache.size() >= CAPACITY) {
			DNode deletableNode = frequencyMap.get(minFrequency).removeLast();
			valueCache.remove(deletableNode.key);
		}

		DNode newNode = new DNode(key, value);
		valueCache.put(key, newNode);
		if (!frequencyMap.containsKey(newNode.count)) {
			frequencyMap.put(newNode.count, new LinkedList<DNode>());
		}
		frequencyMap.get(newNode.count).add(0, newNode);
		minFrequency = newNode.count;
		printCache();
	}

	public void printCache() {

		System.out.println("------- VALUE MAP -------");
		for (Entry<Integer, DNode> entry : valueCache.entrySet()) {
			System.out.println(entry);
		}

		System.out.println("------- FREQUENCY MAP -------");
		for (Entry<Integer, LinkedList<DNode>> entry : frequencyMap.entrySet()) {
			System.out.println(entry);
		}

		System.out.println("==Min Frequency == :" + minFrequency);
	}
}
