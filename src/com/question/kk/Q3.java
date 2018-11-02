package com.question.kk;

public class Q3 {
	public static int solution(int[] A) {
		int n = A.length;
		int result = 0;
		for (int i = 0; i < n - 1; i++) {
			if (A[i] == A[i + 1]) {
				result = result + 1;
			}
		}
		System.out.println("result = " + result);
		int r = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			if (i > 0) {
				if (A[i - 1] != A[i])
					count = count + 1;
				else
					count = count - 1;
			}
			System.out.println("count1 " + count);
			if (i < n - 1) {
				if (A[i + 1] != A[i])
					count = count + 1;
				else
					count = count - 1;
			}
			System.out.println("count2 " + count);
			r = Math.max(r, count);
			System.out.println("r = " + r);
		}
		return result + r;
	}

	public static void main(String[] args) {
		int[] A = { 1, 0, 0, 1, 0, 0 };
		System.out.println(Q3.solution(A));
	}
}
