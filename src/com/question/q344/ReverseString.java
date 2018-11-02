package com.question.q344;

public class ReverseString {
	public static String reverseString(String s) {
		StringBuffer stringBuffer = new StringBuffer(s);
		return stringBuffer.reverse().toString();
	}

	public static void main(String[] args) {
		// Input: "hello"
		String s = "hello";
		// Output: "olleh"
		System.out.println(ReverseString.reverseString(s));

	}
}
