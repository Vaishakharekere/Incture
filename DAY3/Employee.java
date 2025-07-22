package com.demo.DAY3;

public abstract class Employee {
	protected String name;
	protected int employeeID;
	protected double basicSalary;
	
	public Employee(String name,int employeeID,double basicSalary) {
		this.name=name;
		this.employeeID=employeeID;
		this.basicSalary=basicSalary;
	}
	public void  displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Employee ID :"+employeeID);
		System.out.println("Basic Salary : "+basicSalary);
		
		
	}
	public abstract void calculateSalary();
}
class RegularEmployee extends Employee
{
	public RegularEmployee(String name, int employeeID, double basicSalary) {
		super(name, employeeID, basicSalary);
		  
		}
	public void  calculateSalary() {
		  basicSalary*=1.2;
		System.out.println("Salary : "+basicSalary);
	}

}
class ContractEmployee extends Employee{

	public ContractEmployee(String name, int employeeID, double basicSalary) {
		super(name, employeeID, basicSalary);
		
	}
	public void  calculateSalary() {
		  basicSalary=1*basicSalary;
		System.out.println("Salary : "+basicSalary);
	}
	
}
