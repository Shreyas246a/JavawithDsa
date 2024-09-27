package com.java.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str1="Shreyas";
		String str2="Shreyas2";
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.charAt(3));
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str1.length());
		System.out.println(str1.substring(4));
		System.out.println(str2.substring(1,5));
		System.out.println(str1.replace('e','2'));

		
		String day="Hello, have a good day";
		
		String res=day.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]","");
		System.out.println(res);
		
	}

}
