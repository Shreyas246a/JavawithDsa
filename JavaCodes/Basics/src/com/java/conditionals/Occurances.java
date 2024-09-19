package com.java.conditionals;

public class Occurances {
	public static void main(String[] args) {
		int num =4333212;
		int count=0;
		while (num>0) {
			int rem = num % 10;
			if(rem == 3) {
				count +=1;
			}
			num=num/10;
		}
		System.out.println(count);
	}
}
