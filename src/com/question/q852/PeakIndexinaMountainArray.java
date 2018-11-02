package com.question.q852;

public class PeakIndexinaMountainArray {
	// public int core(int[] A, int start, int end) {
	// if (start == end) {
	// return start;
	// }
	// int mid = ((end - start) >> 1) + start;
	// if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
	// return mid;
	// }
	// if (A[mid] < A[mid + 1]) {
	// return core(A, mid + 1, end);
	// }
	// if (A[mid] < A[mid - 1]) {
	// return core(A, start, mid - 1);
	// }
	// return -1;
	// }
	//
	// public int peakIndexInMountainArray(int[] A) {
	// return core(A, 0, A.length - 1);
	// }
	public int peakIndexInMountainArray(int[] A) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
				count = i;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// Input: [0,2,1,0]
		int[] A = { 0, 2, 1, 0 };
		// Output: 1
		while (true) {
			System.out.println("a");
			for (int i = 0; i < 3; i++) {
				System.out.println(i);
				if (i == 2) {
					break;
				}
			}

		}
		// PeakIndexinaMountainArray array = new PeakIndexinaMountainArray();
		// System.out.println(array.peakIndexInMountainArray(A));
	}
}
