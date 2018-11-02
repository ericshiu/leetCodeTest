package com.question.kk;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Q2 {
	private static Long getSeconds(String time) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date reference = dateFormat.parse("00:00:00");
		Date date = dateFormat.parse(time);
		long seconds = (date.getTime() - reference.getTime()) / 1000L;
		return seconds;
	}

	public static int solution(String S) {

		Long BOUNDARY = 300L;
		Long SECONDS_PER_MINUTE = 60L;
		Long PAYMENT_RATE_BY_SEC = 3L;
		Long PAYMENT_RATE_BY_MIN = 150L;

		try {// write your code in Java SE 8
			long price = 0;
			String[] arr = S.split("\n\r");
			Map<String, Long> answerMap = new HashMap<String, Long>(16);
			for (int i = 0; i < arr.length; i++) {
				String[] detailedLineArr = arr[i].split(",");
				if (answerMap.containsKey(detailedLineArr[1])) {
					answerMap.put(detailedLineArr[1],
							answerMap.get(detailedLineArr[1]) + getSeconds(detailedLineArr[0]));
				} else {
					answerMap.put(detailedLineArr[1], getSeconds(detailedLineArr[0]));
				}
			}
			for (String key : answerMap.keySet()) {
				if (answerMap.get(key) >= BOUNDARY) {
					if (price != 0) {
						if (price > (long) Math.ceil((double) answerMap.get(key) / SECONDS_PER_MINUTE)
								* PAYMENT_RATE_BY_MIN) {
							price = (long) Math.ceil((double) answerMap.get(key) / SECONDS_PER_MINUTE)
									* PAYMENT_RATE_BY_MIN;
						}
					}
					price = (long) Math.ceil((double) answerMap.get(key) / SECONDS_PER_MINUTE) * PAYMENT_RATE_BY_MIN;
				} else {
					if (price != 0) {
						if (price > answerMap.get(key) * PAYMENT_RATE_BY_SEC) {
							price = answerMap.get(key) * PAYMENT_RATE_BY_SEC;
						}
					}
					price = answerMap.get(key) * PAYMENT_RATE_BY_SEC;
				}
			}
			return (int) price;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static void main(String[] args) {
		String string = "00:05:07,A\r\n00:05:01,B\r\n00:05:07,A\r\n00:05:00,A\r\n";
		System.out.println(solution(string));
	}
}
