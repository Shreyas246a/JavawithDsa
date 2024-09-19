package com.java.conditionals;

import java.util.Scanner;

public class Fibbonacci {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  int n = in.nextInt();
		  int a=0;
		  int sum=1;
		  int i=0;
		  while(i<=n) {
			 int temp=sum;
			 sum=sum+a;
			 a=temp;
			 i++;
		  }
		  System.out.println(sum);
	}

}
