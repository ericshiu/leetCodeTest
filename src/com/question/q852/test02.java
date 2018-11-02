package com.question.q852;

public class test02 {
	private static ThreadLocal<String> a = new ThreadLocal<String>();

	public static void main(String[] args) {
		a.set("a");
		System.out.println(a.get());
		a.remove();
		System.out.println(a.get());

	}
}
