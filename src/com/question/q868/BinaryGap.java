package com.question.q868;

public class BinaryGap {
	public static int binaryGap(int N) {
		int last = -1, ans = 0;
		for (int i = 0; i < 32; ++i) {
			if (((N >> i) & 1) > 0) {
				if (last >= 0)
					ans = Math.max(ans, i - last);
				last = i;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		// Input: 22
		int N = 22;
		// Output: 2
		System.out.println(BinaryGap.binaryGap(N));
		// Explanation:
		// 6 in binary is 110.
	}
}
