package com.question.q557;

public class ReverseWordsinaStringIII {
	// public static String reverseWords(String s) {
	// String[] sArr = s.split(" ");
	// String sb = "";
	// for (int i = 0; i < sArr.length; i++) {
	// String[] singleWord = sArr[i].split("");
	// for (int j = singleWord.length - 1; j >= 0; j--) {
	// sb += singleWord[j];
	// }
	// if (i != sArr.length - 1) {
	// sb += " ";
	// }
	// }
	// return sb;
	// }
	public static String reverseWords(String s) {
		String[] sArr = s.split(" ");
		String as = "";
		for (int i = 0; i < sArr.length; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(sArr[i]);
			sb.reverse();
			as += sb.toString();
			if (i != sArr.length - 1) {
				as += " ";
			}
		}
		return as;

	}

	public static void main(String[] args) {
		// Input: "Let's take LeetCode contest"
		String s = "Let's take LeetCode contest";
		// Output: "s'teL ekat edoCteeL tsetnoc"
		System.out.println(ReverseWordsinaStringIII.reverseWords(s));
	}
}
