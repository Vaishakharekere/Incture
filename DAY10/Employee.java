package com.demo.DAY10;


public class Employee {
private int id;
private String name;
private double salary;

//Getters and Setters for Manual Setting of Values
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;


}
//Constructor
public Employee(int id, String name , double salary) {
this.id=id;
this.name=name;
this.salary=salary;
	
}
@Override
public String toString() {
	return " [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
