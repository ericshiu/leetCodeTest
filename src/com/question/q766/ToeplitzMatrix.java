package com.question.q766;

public class ToeplitzMatrix {
	public static boolean isToeplitzMatrix(int[][] matrix) {
		int high = matrix.length;
		int width = matrix[0].length;
		for (int i = 0; i < width; i++) {
			// 对角线是否全相等
			int c = matrix[0][i];
			int k = 0;
			int j = i;
			while (++k < high && ++j < width) {
				if (matrix[k][j] != c)
					return false;  // 不是
			}
		}

		// 遍历第一列
		for (int i = 0; i < high; i++) {
			// 对角线是否全相等
			int c = matrix[i][0];
			int k = i;
			int j = 0;
			while (++k < high && ++j < width) {
				if (matrix[k][j] != c)
					return false;  // 不是
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 2, 1, 2 };
		int[] c = { 2, 2, 1 };
		int[][] matrix = new int[3][3];
		matrix[0] = a;
		matrix[1] = b;
		matrix[2] = c;
		// Input:
		// matrix = [
		// [1,2],
		// [2,2]
		// ]
		// Output: False
		System.out.println(ToeplitzMatrix.isToeplitzMatrix(matrix));
	}
}
