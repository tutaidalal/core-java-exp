package com.tutai.exp.lambda;
/**
 * @author tkd
 */
public class Student {

	int roll;
	int marks;
	String name;
	
	public Student(int roll, int marks) {
		super();
		this.roll = roll;
		this.marks = marks;
	}
	
	

	public Student(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}



	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
