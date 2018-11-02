package com.question.kk;

public class Q1 {
	public static int solution(int[] A) {
		// size紀錄list長度
		int size = 0;
		// arrayValue紀錄A[k]
		int arrayValue;
		// arrayIndex紀錄下次跳躍的索引
		int arrayIndex = 0;
		// do while 結尾檢查是否為最後節點,arrayValue是否為-1
		do {
			// list長度+1
			size++;
			// A[k]附值給arrayValue
			arrayValue = A[arrayIndex];
			// arrayValue附值給arrayIndex(下次跳躍的索引)
			arrayIndex = arrayValue;
		} while (arrayValue != -1);

		return size;
	}

	public static void main(String[] args) {
		int[] A = { 1, 4, -1, 3, 2 };
		Q1 aQ1 = new Q1();
		System.out.println(aQ1.solution(A));

	}
}
