package com.java.oops;

class SS{
	String name;
	protected void finalize() throws Throwable {
		System.out.println("Object destroyed");
	}
}

public class Garbagecollector {

	public static void main(String[] args) {
	SS obj;
	
	for(int i=0;i<1000000;i++) {
		obj=new SS();
	}

	}

}
