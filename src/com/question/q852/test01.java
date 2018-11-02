package com.question.q852;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class test01 {
	public static String toInt(String str) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Mon", "1");
		map.put("Tue", "2");
		map.put("Wed", "3");
		map.put("Thu", "4");
		map.put("Fri", "5");
		map.put("Sat", "6");
		map.put("Sun", "7");
		return map.get(str);
	}

	public int solution(String S) {
		S = S.replaceAll(" ", "").replaceAll("\r", "").replaceAll("\n", "");
		ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
		for (int i = 0; i < S.length() / 14; i++) {
			Map<String, TreeMap<String, String>> map = new TreeMap<String, TreeMap<String, String>>();
			String title = S.substring(i * 14, (i + 1) * 14).substring(0, 3);
			String value = S.substring(i * 14, (i + 1) * 14).replaceAll(title, "");
			String start = value.substring(0, value.indexOf("-"));
			String end = value.substring(value.indexOf("-"), value.length());
			System.out.println(toInt(title) + "--" + start + "--" + end);
		}
		// write your code in Java SE 8
		return 0;
	}

	public static void main(String[] args) {
		String S = "Sun 10:00-20:00\r\n" + "Fri 05:00-10:00\r\n" + "Fri 16:30-23:50\r\n" + "Sat 10:00-24:00\r\n"
				+ "Sun 01:00-04:00\r\n" + "Sat 02:00-06:00\r\n" + "Tue 03:30-18:15\r\n" + "Tue 19:00-20:00\r\n"
				+ "Wed 04:25-15:14\r\n" + "Wed 15:14-22:40\r\n" + "Thu 00:00-23:59\r\n" + "Mon 05:00-13:00\r\n"
				+ "Mon 15:00-21:00";

		test01 test01 = new test01();
		test01.solution(S);
	}
}
