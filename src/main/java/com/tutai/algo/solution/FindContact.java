package com.tutai.algo.solution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class FindContact {
	
	static class DictionaryNode {
		DictionaryNode[] children = new DictionaryNode[26];
		public int size = 0;

		public void putChildIfAbsent(char ch) {
			if (children[ch - 'a'] == null) {
				children[ch - 'a'] = new DictionaryNode();
			}
		}

		public DictionaryNode getChild(char ch) {
			return children[ch - 'a'];
		}
	}
	
	static class Dictionary {
		DictionaryNode root = new DictionaryNode();

		public void add(String str) {
			DictionaryNode curr = root;
			for (char ch : str.toCharArray()) {
				curr.putChildIfAbsent(ch);
				curr = curr.getChild(ch);
				curr.size++;
			}
		}

		public int find(String prefix) {
			DictionaryNode curr = root;

			for (char ch : prefix.toCharArray()) {
				curr = curr.getChild(ch);
				if (curr == null) {
					return 0;
				}
			}
			return curr.size;
		}
	}
	
	public static List<Integer> contacts(List<List<String>> queries) {
		// Write your code here
		List<Integer> result = new LinkedList<Integer>();

		Dictionary tire = new Dictionary();

		for (List<String> query : queries) {
			String nameValue = query.get(1);
			if (query.get(0).equals("add")) {
				tire.add(nameValue);
			} else {

				int count = tire.find(nameValue);
				result.add(count);

			}
		}
		return result;

	}
	
	public static void main(String[] args) throws IOException {
		List<List<String>> queries = new ArrayList<List<String>>();
		queries.add(Arrays.asList("add", "tutai"));
		queries.add(Arrays.asList("get", "tut"));
		List<Integer> result = FindContact.contacts(queries);
		System.out.println(result);
	}
}
