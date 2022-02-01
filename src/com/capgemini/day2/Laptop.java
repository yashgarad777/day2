package com.capgemini.day2;

class Specification{
	int Ram;
	String processor;
	String company;
	float price;
	
	//Default Constructor:-
	Specification(){
		
	}
	
	//Parameterized Constructor:-
	Specification(int Ram, String processor, String company, float price){
		this.Ram = Ram;
		this.processor = processor;
		this.company = company;
		this.price = price;
	}

	public int getRam() {
		return Ram;
	}

	public void setRam(int ram) {
		Ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println("Company name :- "+this.company);
		System.out.println("Ram :- "+this.Ram+"GB");
		System.out.println("processor :- "+this.processor);
		System.out.println("Price of a product :- "+this.price+"ruppes");
	}
}

public class Laptop {
	public static void main(String[] args) {
		Specification S1 = new Specification(8,"Intel i-5","MSI",56000f);
		S1.print();
		System.out.println("\n");
		
		Specification S2 = new Specification();
		S2.setCompany("HP");
		S2.setPrice(50000f);
		S2.setProcessor("Intel i-3");
		S2.setRam(16);
		S2.print();
	}

}