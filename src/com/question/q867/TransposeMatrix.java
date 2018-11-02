package com.question.q867;

public class TransposeMatrix {
	public static int[][] transpose(int[][] A) {
		int arrCount = A.length;
		int contentCount = A[0].length;
		int[][] B = new int[contentCount][arrCount];
		for (int i = 0; i < contentCount; i++) {
			int[] appendArr = new int[arrCount];
			for (int j = 0; j < arrCount; j++) {
				appendArr[j] = A[j][i];
			}
			B[i] = appendArr;
		}
		return B;
	}

	public static void main(String[] args) {

		// Input: [[1,2,3],[4,5,6],[7,8,9]]
		int[][] A = new int[2][2];
		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 4, 5, 6 };
		// int[] a3 = { 7, 8, 9 };
		A[0] = a1;
		A[1] = a2;
		// A[2] = a3;
		// Output: [[1,4,7],[2,5,8],[3,6,9]]
		System.out.println(TransposeMatrix.transpose(A));
	}

}
