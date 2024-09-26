package com.java.arrays;

public class Maxmin {

	public static void main(String[] args) {
		int[]arr= {4,7,6,2,3,60,33};
		System.out.println("Max: "+max(arr));
		System.out.println("Min: "+min(arr));
	}
	static int max(int[]arr) {
		if(arr.length==0) {
			return -1;
		}
		int max=arr[0];
		
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}	
		return max;
		
	}
	
	static int min(int[] arr) {
		if(arr.length==0) {
			return -1;
		}
		int min=arr[0];
		for(int i:arr) {
			if(i<min) {
				min=i;
			}
		}
		return min;
	}

}
