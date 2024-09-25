package com.java.functions;

import java.util.Arrays;

public class Overloading {
	public static void main(String[] args) {
	
	}
	static void demo(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	static void demo(String ...v) {
		System.out.println(Arrays.toString(v));
	}
}
