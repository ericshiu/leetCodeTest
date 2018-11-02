package com.question.q852;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		for (int j = 0; j < strs[0].length(); ++j) {
			for (int i = 0; i < strs.length - 1; ++i) {
				if (j >= strs[i].length() || j >= strs[i + 1].length() || strs[i].charAt(j) != strs[i + 1].charAt(j)) {
					return strs[i].substring(0, j);
				}
			}
		}
		return strs[0];
	}

	public int solution(String[] T, String[] R) {
		// write your code in Java SE 8
		String prefix = longestCommonPrefix(T);
		for (int i = 0; i < T.length; i++) {
			String groupArr = T[i].replaceAll(prefix, "");
			T[i] = groupArr;
		}
		System.out.println(Arrays.toString(T));
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < T.length; i++) {
			char[] chart = T[i].toCharArray();
			String aString = "";
			for (char c : chart) {
				if (c >= '0' && c <= '9') {
					aString = aString + c;
				}
			}
			if (map.containsKey(aString)) {
				map.put(aString, map.get(aString) + "," + String.valueOf(i));
			} else {
				map.put(aString, String.valueOf(i));
			}
		}
		int count = 0;
		System.out.println(map);
		for (String key : map.keySet()) {
			int pass = 0;
			String[] indexs = map.get(key).split(",");
			for (String index : indexs) {
				if (R[Integer.valueOf(index)].equals("OK")) {
					pass++;
				}
			}
			if (pass == indexs.length) {
				count++;
			}
		}
		System.out.println("count : " + count);
		return (count * 100) / map.size();
	}

	public static void main(String[] args) {
		// String[] T = { "test1a", "test2", "test1b", "test1c", "test3" };
		// String[] R = { "Wrong answer", "OK", "Runtime error", "OK", "Time limit exceeded" };
		String[] T = { "codility1", "codility3", "codility2", "codility4b", "codility4a" };
		String[] R = { "Wrong answer", "OK", "OK", "Runtime error", "OK" };
		test testa = new test();
		System.out.println(testa.solution(T, R));
	}
}
