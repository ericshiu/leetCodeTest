package com.question.q682;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
	public int calPoints(String[] ops) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < ops.length; i++) {
			String string = ops[i];
			if (isInteger(string)) {
				// 是數字
				list.add(string);
			}
			if (string.equals("C")) {
				// 是C
				list.remove(list.size() - 1);
			}
			if (string.equals("D")) {
				// 是D
				int dString = Integer.parseInt(list.get(list.size() - 1)) * 2;
				list.add(String.valueOf(dString));
			}
			if (string.equals("+")) {
				// 是+
				list.add(String.valueOf(
						Integer.parseInt(list.get(list.size() - 1)) + Integer.parseInt(list.get(list.size() - 2))));
			}
			System.out.println(list);
		}

		int ans = 0;
		for (String string : list) {
			ans += Integer.parseInt(string);
		}
		return ans;
	}

	public boolean isInteger(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		// Output: 27
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		// Output: 30
		// String[] ops = { "5", "2", "C", "D", "+" };
		BaseballGame aBaseballGame = new BaseballGame();
		System.out.println(aBaseballGame.calPoints(ops));
	}
}
