package com.capgemini.day2;

class PersonDetails{
	private String name;
	private int age;
	private char sex;
	private float salary;
	
	PersonDetails(){
		System.out.println("Default Constructure");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void print(){
		System.out.println("Name Entered:- "+this.name);
		System.out.println("Your Age:- "+this.age);
		System.out.println("Your Sex:- "+this.sex);
		System.out.println("Your Annual Salary:- "+this.salary);
		
	}
	
}

public class Person {
	public static void main(String[] args){
		PersonDetails p1 = new PersonDetails();
		p1.setName("Onkar");
		p1.setAge(21);
		p1.setSex('M');
		p1.setSalary(400000);
		p1.print();
		
		//Creating 2nd Object:-
		System.out.println("---------------------------------------------");
		PersonDetails p2 = new PersonDetails();
		p2.setName("Vyankatesh");
		p2.setAge(22);
		p2.setSex('M');
		p2.setSalary(500000);
		
		//Calling Getter Methods:- 
		System.out.println("Name Entered:- "+p2.getName());
		System.out.println("Your Age:- "+p2.getAge());
		System.out.println("Your Sex:- "+p2.getSex());
		System.out.println("Your Annual Salary:- "+p2.getSalary());
		
	}
	

}
