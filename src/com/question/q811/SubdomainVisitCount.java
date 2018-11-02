package com.question.q811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount {
	public static List<String> subdomainVisits(String[] cpdomains) {
		HashMap<String, Integer> answerMap = new HashMap<>();
		for (String string : cpdomains) {
			String[] arr = string.split(" ");
			String[] dnsArr = arr[1].split("\\.");
			String dns = "";
			for (int i = dnsArr.length - 1; i >= 0; i--) {
				if (i == dnsArr.length - 1) {
					dns = dnsArr[i] + dns;
				} else {
					dns = dnsArr[i] + "." + dns;
				}
				if (answerMap.containsKey(dns)) {
					answerMap.put(dns, answerMap.get(dns) + Integer.valueOf(arr[0]));
				} else {
					answerMap.put(dns, Integer.valueOf(arr[0]));
				}
			}
		}
		System.out.println(answerMap);
		List<String> list = new ArrayList<String>();
		for (String key : answerMap.keySet()) {
			list.add(answerMap.get(key) + " " + key);
		}
		return list;

	}

	public static void main(String[] args) {
		// Input: ["9001 discuss.leetcode.com"]
		String[] cpdomains = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
		// Output: ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1
		// intel.mail.com","951 com"]
		System.out.println(SubdomainVisitCount.subdomainVisits(cpdomains));
		// Explanation: We only have one website domain: "discuss.leetcode.com". As discussed above,
		// the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited
		// 9001 times.
	}
}
