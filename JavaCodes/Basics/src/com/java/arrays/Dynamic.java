package com.java.arrays;
import java.util.Arrays;

public class Dynamic {

	public static void main(String[] args) {
		int[][] arr= {
				
				{5,9,4,8},
				{8,9,2},
				{9,2,3,7,8,9}
				
		};
		
		
		for(int[]i:arr) {
			System.out.println(Arrays.toString(i)+" "+i.length);
			
		}

	}

}
