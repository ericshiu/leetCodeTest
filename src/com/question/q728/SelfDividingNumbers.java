package com.question.q728;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			boolean sd = true;
			int num = i;
			while (num > 0) {
				int digit = num % 10;
				if (digit == 0 || i % digit != 0) {
					sd = false;
					break;
				}
				num = num / 10;
			}
			if (sd) {
				res.add(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// Input: left = 1, right = 22
		int left = 1;
		int right = 22;
		// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
		System.out.println(SelfDividingNumbers.selfDividingNumbers(left, right));
	}
}
