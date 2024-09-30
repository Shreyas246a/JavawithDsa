package com.java.oops;


class Student{
	int rno;
	String name;
	float marks;
	
	Student(){
		this.rno=0;
		this.name="";
		this.marks=0.0f;
	};
	
	Student(Student other){
		this.name=other.name;
		this.rno=other.rno;
		this.marks=other.marks;
	}

	Student(int rno,String name,float marks){
		this.rno=rno;
		this.name=name;
		this.marks=marks;
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Student []std = null;
		
		std[0]=new Student();
		
	}
	
}
