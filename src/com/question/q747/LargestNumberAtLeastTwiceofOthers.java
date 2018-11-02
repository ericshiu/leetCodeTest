package com.question.q747;

public class LargestNumberAtLeastTwiceofOthers {
	/**
	 * 
	 * In a given integer array nums, there is always exactly one largest element.
	 * 
	 * Find whether the largest element in the array is at least twice as much as every other number
	 * in the array.
	 * 
	 * If it is, return the index of the largest element, otherwise return -1.
	 */

	// 至少是其他数字两倍的最大数
	public static int dominantIndex(int[] nums) {
		int max = 0;
		int maxIndex = 0;
		// 先找到最大值&它的位置
		for (int i = 0; i < nums.length; ++i) {
			if (max < nums[i]) {
				max = nums[i];
				maxIndex = i;
			}
		}
		System.out.println(max + " " + maxIndex);

		// 然後尋找倍數
		for (int num : nums) {
			// 只要有低於兩倍的，就是沒有這得數字
			if (max != num && max - num < num) {
				return -1;
			}
		}
		return maxIndex;
	}

	public static void main(String[] args) {
		// Input: nums = [3, 6, 1, 0]
		int[] nums = { 3, 6, 1, 0 };
		// Output: 1
		System.out.println(LargestNumberAtLeastTwiceofOthers.dominantIndex(nums));
	}
}
