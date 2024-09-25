package com.java.functions;

public class Shadowing {

	static int x=40;
	public static void main(String[] args) {
		int x =30;		//Shadowding static int x
		System.out.println(x);
	}
}
