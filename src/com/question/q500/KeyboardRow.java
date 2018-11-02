package com.question.q500;

import java.util.Arrays;

public class KeyboardRow {
	public static String[] findWords(String[] words) {
		if (words.length == 0) {
			return words;
		}
		String[] aStrings = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
		String answer = "";
		for (String string : words) {
			for (String string2 : aStrings) {
				boolean a = true;
				for (String lowString : string.toLowerCase().split("")) {
					if (string2.indexOf(lowString) < 0) {
						a = false;
						break;
					}
				}
				if (a == true) {
					answer = string + "," + answer;
					break;
				}
			}
		}
		String[] aStrings1 = {};
		return answer.length() > 0 ? answer.split(",") : aStrings1;
	}

	public static void main(String[] args) {
		// Input: ["Hello", "Alaska", "Dad", "Peace"]
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		// Output: ["Alaska", "Dad"]
		System.out.println(Arrays.toString(KeyboardRow.findWords(words)));
	}
}
