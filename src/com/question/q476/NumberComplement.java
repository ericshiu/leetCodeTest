package com.question.q476;

public class NumberComplement {
	public static int findComplement(int num) {
		String[] strArr = Integer.toBinaryString(num).toString().split("");
		String answer = "";
		for (String string : strArr) {
			answer += string.equals("0") ? "1" : "0";
		}
		return Integer.valueOf(answer, 2);
	}

	public static void main(String[] args) {
		// Input: 5
		int num = 5;
		// Output: 2
		System.out.println(NumberComplement.findComplement(num));
		// Explanation: The binary representation of 5 is 101 (no leading zero bits), and its
		// complement is 010. So you need to output 2.

	}
}
