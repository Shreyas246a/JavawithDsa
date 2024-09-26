package com.java.arrays;


import java.util.Scanner;

public class Inputarr {

	public static void main(String[] args) {
		int[] arr =new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
