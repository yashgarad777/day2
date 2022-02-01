package com.capgemini.day2;

class EmployeeDetails {
	private int eId;
	private String eName;
	private String eDepartment;
	EmployeeDetails(){
		System.out.println("Default Constructor");
		
	}
	
	public EmployeeDetails(int eId, String eName, String eDepartment) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDepartment = eDepartment;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDepartment() {
		return eDepartment;
	}
	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}
	
	public String toString() {
		return "Employee [Employee Id: " +eId+ ", Employee Name: " +eName+ ", Employee Department: " +eDepartment+ "]";
	}
}



public class Employee {
	public static void main(String[]args ){
		EmployeeDetails e1 = new EmployeeDetails(50, "Onkar", "Analyst");
		EmployeeDetails e2 = new EmployeeDetails(51, "Vyankatesh", "Developer");
		EmployeeDetails e3 = new EmployeeDetails(45, "Sham", "Testing");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		
		
	}

}
