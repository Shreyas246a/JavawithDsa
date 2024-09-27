package com.java.strings;

public class SB {

	public static void main(String[] args) {
	//Can change value of a string without creating a new object every time
	StringBuilder name=new StringBuilder("Shreyas");
	System.out.println(name);	
	name.append('s');
	System.out.println(name);
	}
}
