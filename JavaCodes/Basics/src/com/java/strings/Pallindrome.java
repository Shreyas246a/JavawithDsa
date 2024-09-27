package com.java.strings;

import java.util.Scanner;

public class Pallindrome {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=sc.next();
	if(isPallindrome(str)) {
	   System.out.printf("%s is a Pallindrome",str);
	}
	else {
		System.out.printf("%s is not a Pallindrome",str);
	}
 }
 
 static boolean isPallindrome(String str) {
	 if(str==null || str.length()==0) {
		 return true;
	 }
	 
	 
	 for(int i=0;i<str.length()/2;i++) {	 
		 char start = str.charAt(i);
		 char end = str.charAt(str.length()-1-i);
		 
		 if(start != end) {
			 return false;
		 }
	}
	 return true;
	 
 }
}
