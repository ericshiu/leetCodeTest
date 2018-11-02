package com.question.q884;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class UncommonWordsfromTwoSentences {
	public static String[] uncommonFromSentences(String A, String B) {
		String[] arr = (A + " " + B).split(" ");
		HashMap<String, Integer> answerMap = new HashMap<>();
		for (String string : arr) {
			answerMap.put(string, answerMap.getOrDefault(string, 0) + 1);
		}
		LinkedList<String> ll = new LinkedList<String>();
		for (String i : answerMap.keySet()) {
			if (answerMap.get(i) == 1) {
				ll.add(i);
			}
		}
		return ll.toArray(new String[ll.size()]);
	}

	public static void main(String[] args) {
		// Input: A = "this apple is sweet", B = "this apple is sour"
		String A = "this apple is sweet", B = "this apple is sour";
		// Output: ["sweet","sour"]
		System.out.println(Arrays.toString(UncommonWordsfromTwoSentences.uncommonFromSentences(A, B)));
	}

}
