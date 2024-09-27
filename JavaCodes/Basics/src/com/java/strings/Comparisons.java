package com.java.strings;

public class Comparisons {
	public static void main(String[] args) {
		
		String a="Shreyas";
		String b="Shreyas";
		
		System.out.println(a==b);//If true a and b are referring to same object 
		
		//Create different objects for the same strings using new keyword
		
		String name1=new String("Shreyas");
		String name2=new String("Shreyas");
		
	//These are created in heap not in String pool
		
		System.out.println(name1==name2);//gives false cause both are referring to different objects
		
	//To compare we use .equals methods
		
		System.out.println(name1.equals(name2));
		
	//.charAt
		
		System.out.println(name1.charAt(3));
		
	}
}
