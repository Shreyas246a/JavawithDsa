package com.java.conditionals;

import java.util.Scanner;

public class Alphabetcase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ch = in.next();
		System.out.println(ch);
		int big=0;
		int small=0;
		
		for(int c=0;c<ch.length();c++) {
			if(ch.charAt(c)>='a' && ch.charAt(c)<='z') {
				small+=1;
			}
			else {
				big+=1;
			}
		}
		System.out.print("There are "+big+" capital letters and "+small+" small letters in "+ch);
	
	}

}
