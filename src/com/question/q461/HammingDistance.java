package com.question.q461;

public class HammingDistance {
	// public static int hammingDistance(int x, int y) {
	// int count = 0;
	// if (Integer.toBinaryString(y).length() > Integer.toBinaryString(x).length()) {
	// String[] xArr = String.format("%" + Integer.toBinaryString(y).length() + "s",
	// Integer.toBinaryString(x))
	// .replaceAll(" ", "0").split("");
	// String[] yArr = Integer.toBinaryString(y).split("");
	// for (int i = 0; i < xArr.length; i++) {
	// if (!xArr[i].equals(yArr[i])) {
	// count++;
	// }
	// }
	// } else if (Integer.toBinaryString(y).length() == Integer.toBinaryString(x).length()) {
	// String[] xArr = Integer.toBinaryString(x).split("");
	// String[] yArr = Integer.toBinaryString(y).split("");
	// for (int i = 0; i < xArr.length; i++) {
	// if (!xArr[i].equals(yArr[i])) {
	// count++;
	// }
	// }
	// } else {
	// String[] xArr = Integer.toBinaryString(x).split("");
	// String[] yArr = String.format("%" + Integer.toBinaryString(x).length() + "s",
	// Integer.toBinaryString(y))
	// .replaceAll(" ", "0").split("");
	// for (int i = 0; i < xArr.length; i++) {
	// if (!xArr[i].equals(yArr[i])) {
	// count++;
	// }
	// }
	// }
	// return count;
	// }
	public static int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}

	public static void main(String[] args) {
		// Input: x = 1, y = 4
		Integer x = 1;
		Integer y = 4;
		// Output: 2
		System.out.println(HammingDistance.hammingDistance(x, y));

	}
}
