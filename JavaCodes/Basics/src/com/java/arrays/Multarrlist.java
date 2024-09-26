package com.java.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Multarrlist {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		list.add(new ArrayList<Integer>());
		list.add(new ArrayList<Integer>());
		list.add(new ArrayList<Integer>());
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++)
			list.get(i).add(sc.nextInt());
			
		}
		
		System.out.println(list);
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++)
			if(list.get(i).contains(5)) {
				System.out.println(i+" true");
				break;
			}
			
			
		}
		
	}

}
