package com.java.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIstExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist=new ArrayList<Integer>(5);
		Scanner sc=new Scanner(System.in);
		
		arrlist.add(321);
		arrlist.add(4241);
		arrlist.add(21412);
		arrlist.add(321);
		arrlist.add(4241);
		arrlist.add(21412);
		arrlist.add(321);
		arrlist.add(4241);
		arrlist.add(21412);
		
		
		//Change an element
		
		System.out.println(arrlist);
		arrlist.set(0, 55555);
		System.out.println("Changed list : "+arrlist);
		
		
		//Input
		System.out.println("Enter new elements");
		for(int i=0;i<5;i++) {
			arrlist.add(sc.nextInt());
		}
		
		//Output
		System.out.println("After Adding elements");
		for(int i:arrlist) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//Get an item
		System.out.println("Item is : "+arrlist.get(3));
	}

}
