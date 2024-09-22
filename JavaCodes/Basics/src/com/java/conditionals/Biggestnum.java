package com.java.conditionals;

import java.util.Scanner;

public class Biggestnum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a =in.nextInt();
		int b =in.nextInt();
		int c =in.nextInt();
		
//		int max=a;
//		if(b>max) {
//			max=b;
//		if(c>max) {
//			max=c;
//		}
//		System.out.println(max);
//		}
		
//		System.out.println(Math.max(c, Math.max(a, b)));
		int max = (a>b)?(a>c? a : c):(b>c? b:c);
		System.out.println(max);
		in.close();
	}

}
