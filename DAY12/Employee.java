package com.demo.DAY12;

public class Employee {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
private double Salary;
public Employee( String name, double Salary) {
	this.name=name;
	this.Salary=Salary;
	
}
@Override
public String toString() {
	return  name + " earns Rs. " + Salary;
}


}
