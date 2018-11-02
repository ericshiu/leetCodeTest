package com.question.q832;

import java.util.Arrays;

public class FlippinganImage {
	public static int[][] flipAndInvertImage(int[][] A) {
		int[][] B = new int[A.length][A[0].length];
		int[][] C = new int[A.length][A[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				B[i][j] = A[i][j] == 0 ? 1 : 0;
			}
			for (int j = 0; j < A[i].length; j++) {
				C[i][A[i].length - (j + 1)] = B[i][j];
			}
		}
		return C;
	}

	public static void main(String[] args) {
		// Input: [[1,1,0],[1,0,1],[0,0,0]]
		// First [[0,1,1],[1,0,1],[0,0,0]]
		int[][] A = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		// Output: [[1,0,0],[0,1,0],[1,1,1]]
		System.out.println(FlippinganImage.flipAndInvertImage(A));
		for (int[] is : FlippinganImage.flipAndInvertImage(A)) {
			System.out.println(Arrays.toString(is));
		}
	}
}
