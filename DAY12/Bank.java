package com.demo.DAY12;

public class Bank {
	
private String name;
private double Salary;
private boolean isActive;
public String getName() {
	return name;
}
public double getSalary() {
	return Salary;
}
public boolean isActive() {
	return isActive;
}


public void setSalary(double salary) {
	Salary = salary;
}
public Bank(String name,double Salary,boolean isActive) {
	
	this.name=name;
	this.Salary=Salary;
	this.isActive=isActive;
}
@Override
public String toString() {
	return "BankAccount [name=" + name + ", Salary=" + Salary + ", isActive=" + isActive + "]";
}



}
