package com.question.q821;

public class ShortestDistancetoaCharacter {
	public static int[] shortestToChar(String S, char C) {
		String[] sArr = S.split("");
		int[] answer = new int[sArr.length];
		for (int i = 0; i < sArr.length; i++) {
			int fast = 0;
			int after = 0;
			for (int j = i; j < sArr.length; j++) {
				if (String.valueOf(C).equals(sArr[j])) {
					fast = j - i;
					break;
				}
			}
			for (int j = i; j >= 0; j--) {
				if (String.valueOf(C).equals(sArr[j])) {
					after = i - j;
					break;
				}
			}
			int answerInt = fast > after ? after == 0 ? fast : after : fast == 0 ? after : fast;
			System.out.println(answerInt);
			answer[i] = answerInt;
		}
		return answer;
	}

	public static void main(String[] args) {
		// Input: S = "loveleetcode", C = 'e'
		String S = "loveleetcode";
		char C = 'e';
		// Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
		System.out.println(ShortestDistancetoaCharacter.shortestToChar(S, C));
	}
}
