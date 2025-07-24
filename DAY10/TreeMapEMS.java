package com.demo.DAY10;

//store employee details and sort them based on their salary in ascending order using TreeMap.



import java.util.Scanner;
import java.util.TreeMap;


public class TreeMapEMS {

	public static void main(String[] args) {
		TreeMap<Double, Employee> T=new TreeMap<Double, Employee>(); //
		
		Scanner sc=new Scanner(System.in);
		while(true) { //Create Any No of Employee Object
			System.out.println("Enter the Choice:");
			System.out.println("1.Add Employee");
			System.out.println("2.Exit");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("Enter the ID");
				int id=sc.nextInt();
				System.out.println("Enter the Name");
				String s=sc.next();
				System.out.println("Enter the Salary");
				double Salary =sc.nextDouble();
				T.put(Salary,new Employee(id,s,Salary));//Creates new Object Each time and puts it into TreeMap based on Salary
			}
			else {
		 break ;	}
			
		
		}
		for (double Salary:T.keySet()) 
		{
			System.out.println(T.get(Salary));	
		}
		sc.close();
	}
	
}

//Manual Assigning Values to Objects
//Employee e1=new Employee();
//e1.setId(101);
//e1.setName("A");
//e1.setSalary(50000);
//
//Employee e2=new Employee();
//e2.setId(102);
//e2.setName("B");
//e2.setSalary(40000);
//
//Employee e3=new Employee();
//e3.setId(103);
//e3.setName("C");
//e3.setSalary(60000);
//
//T.put(e1.getSalary(), e1);
//T.put(e2.getSalary(), e2);
//T.put(e3.getSalary(), e3);
//
//for (double Salary:T.keySet()) {
//	System.out.println(T.get(Salary));
//	
//}


