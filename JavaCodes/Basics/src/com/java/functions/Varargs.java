package com.java.functions;

import java.util.Arrays;

public class Varargs {

	public static void main(String[] args) {
		func(2,3,4,2);
		
	}
	static void func(int ...v) {
	 System.out.println(Arrays.toString(v));
	}
	
}
