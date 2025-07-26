package com.demo.DAY12;


import java.util.ArrayList;
import java.util.function.Function;

public class EMS {

	public static void main(String[] args) {
		ArrayList<Employee>TS=new ArrayList<Employee>();
		
		TS.add(new Employee("Vaishakh",50000));
		TS.add(new Employee("Chai",15000));
		TS.add(new Employee("Advaith",25000));
		TS.add(new Employee("Sristhi",25000));
		TS.add(new Employee("SKPV",15000));
		
		Function<Employee, Double> Func = i -> i.getSalary() * 1.16;
		
		for (Employee employee : TS) {
			Func.apply(employee);
		}


	}

}
