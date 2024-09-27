package com.java.strings;

import java.util.Arrays;

public class SB {

	public static void main(String[] args) {
	//Can change value of a string without creating a new object every time
	StringBuilder name=new StringBuilder("Shreyas");
	System.out.println(name);	
	name.append('s');
	System.out.println(name);
	
	System.out.println(name.reverse().toString());
	
	
	String str="Think Twice";
	StringBuilder newstr=new StringBuilder();
	String [] strarr=str.split(" ");
	System.out.println(Arrays.toString(strarr));
	
	for(String word : strarr) {

		newstr.append(new StringBuilder(word).reverse()).append(" ");	
	}
	
	System.out.println(newstr);
	
	}

}
