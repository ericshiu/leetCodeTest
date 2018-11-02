package com.question.q804;

import java.util.HashMap;
import java.util.Map;

public class UniqueMorseCodeWords {
	public static int uniqueMorseRepresentations(String[] words) {
		String[] arr = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		Map<String, String> map = new HashMap<>(16);
		for (String string : words) {
			String Unique = "";
			for (char c : string.toCharArray()) {
				Unique = Unique + arr[c - 97];
			}
			if (map.containsKey(Unique)) {
				System.out.println("1");
			} else {
				map.put(Unique, "");
			}
		}

		return map.size();
	}

	public static void main(String[] args) {
		// Input: words = ["gin", "zen", "gig", "msg"]
		String[] words = { "gin", "zen", "gig", "msg" };
		// Output: 2
		System.out.println(UniqueMorseCodeWords.uniqueMorseRepresentations(words));
	}

}
