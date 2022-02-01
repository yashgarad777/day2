package com.capgemini.day2;

class Student {

	// nested static class
	static class Address {

		// variable
		int houseNo;
		String streetName;

		// method
		public void print() {
			System.out.println("Nested class");

		}

	}

	// static block
	// it is special block in the java which will run as first statement of program
	// no need to call this block it will call automatically by the compiler
	static {
		System.out.println("I am static");
	}

	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + " School name " + schoolName + "]";
	}

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	private int rollno;
	private String name;
	// static variable
	static String schoolName;

	// static method
	public static void staticMethod() {
		System.out.println("School Name" + schoolName);
	}

}

public class StaticMethod {
	public static void main(String[] args) {
		Student.schoolName = "Abc school";

		Student s1 = new Student(1001, "Ansar");
		Student s3 = new Student(1002, "Priya");
		Student s2 = new Student(1003, "Mehesh");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		Student.staticMethod();

		Student.Address address = new Student.Address();
		address.print();

	}

}