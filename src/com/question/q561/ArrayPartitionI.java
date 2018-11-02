package com.question.q561;

import java.util.Arrays;

public class ArrayPartitionI {
	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int minNum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				minNum += nums[i];
			}
		}
		return minNum;
	}

	public static void main(String[] args) {
		// Input: [1,2,3,2]
		int[] nums = { 1, 2, 3, 2 };
		// Output: 3
		// Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
		System.out.println(ArrayPartitionI.arrayPairSum(nums));
	}
}
