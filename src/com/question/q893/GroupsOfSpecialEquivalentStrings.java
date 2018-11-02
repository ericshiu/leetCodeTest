package com.question.q893;

import java.util.HashSet;
import java.util.Set;

public class GroupsOfSpecialEquivalentStrings {
	public static int numSpecialEquivGroups(String[] A) {
		Set<String> strSet = new HashSet<>();
		for (String tmp : A) {
			// 長度一直接塞進去
			if (tmp.length() == 1) {
				strSet.add(tmp);
			} else {
				//
				int[] a = new int[52];
				int odd = 0;
				for (char c : tmp.toCharArray()) {
					a[(odd++ % 2 == 0 ? 26 : 0) + c - 'a']++;
				}
				StringBuilder sb = new StringBuilder();
				for (int i : a) {
					sb.append(i);
				}
				strSet.add(sb.toString());
			}
		}
		return strSet.size();
	}

	public static void main(String[] args) {
		// Input: ["a","b","c","a","c","c"]
		String[] A = { "abc", "acb", "bac", "bca", "cab", "cba" };
		// Output: 3
		System.out.println(GroupsOfSpecialEquivalentStrings.numSpecialEquivGroups(A));
		// Explanation: 3 groups ["abc","cba"], ["acb","bca"], ["bac","cab"]
	}
}
