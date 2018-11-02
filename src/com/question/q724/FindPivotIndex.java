package com.question.q724;

public class FindPivotIndex {
	/**
	 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
	 * 
	 * We define the pivot index as the index where the sum of the numbers to the left of the index
	 * is equal to the sum of the numbers to the right of the index.
	 * 
	 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should
	 * return the left-most pivot index.
	 */
	public static int pivotIndex(int[] nums) {
		int sum = 0;
		int leftsum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println(sum);
		for (int i = 0; i < nums.length; ++i) {
			if (leftsum == sum - leftsum - nums[i]) {
				return i;
			}
			leftsum += nums[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		// Input: nums = [1, 7, 3, 6, 5, 6]
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		// Output: 3
		System.out.println(FindPivotIndex.pivotIndex(nums));

	}
}
