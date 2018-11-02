package com.question.q771;

public class JewelsandStones {
	/**
	 * 
	 * You're given strings J representing the types of stones that are jewels, and S representing
	 * the stones you have. Each character in S is a type of stone you have. You want to know how
	 * many of the stones you have are also jewels.
	 * 
	 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters
	 * are case sensitive, so "a" is considered a different type of stone from "A".
	 */
	// public static int numJewelsInStones(String J, String S) {
	// String[] jArr = J.split("");
	// String[] sArr = S.split("");
	// int count = 0;
	// for (String stringJ : jArr) {
	// System.out.println(stringJ);
	// for (String stringS : sArr) {
	// System.out.println(stringS);
	// if (stringJ.equals(stringS)) {
	// count++;
	// }
	// }
	// }
	// return count;
	// }
	public static int numJewelsInStones(String J, String S) {
		String[] jArr = J.split("");
		int count = 0;
		int offset = 0;
		for (String stringJ : jArr) {
			System.out.println(stringJ);
			while ((offset = S.indexOf(stringJ, offset)) != -1) {
				offset = offset + stringJ.length();
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// Input: J = "aA", S = "aAAbbbb"
		String J = "aA";
		String S = "aAAbbbb";
		// Output: 3
		System.out.println(JewelsandStones.numJewelsInStones(J, S));

	}
}
