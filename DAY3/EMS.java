package com.demo.DAY3;

import java.util.Scanner;

public class EMS {
	Scanner sc= new Scanner(System.in);
	 String name;
	 int employeeID;
	 double basicSalary;
	  void getdetails() {
		 System.out.println("Enter the Details");
		 System.out.println("Enter the Name");
		 name=sc.nextLine();
		 System.out.println("Enter the Employee ID");
		 employeeID=sc.nextInt();
		 System.out.println("Enter the Basic Salary");
		 basicSalary=sc.nextDouble();
		 
	 }

	public static void main(String[] args) {	
		EMS ems=new EMS();
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Enter The Type of Employee");
			System.out.println("1.Regular Employee\n2.Contract Employee\n3.Exit");
			int n=sc.nextInt();
			if(n==1)
			{
				ems.getdetails();
				Employee re=new RegularEmployee(ems.name, ems.employeeID, ems.basicSalary);
				re.displayDetails();
				re.calculateSalary();
				
			}
			else if(n==2)
			{
				ems.getdetails();
			Employee ce=new ContractEmployee(ems.name, ems.employeeID, ems.basicSalary);
			ce.displayDetails();
			ce.calculateSalary();
				
			}
			else if(n == 3) {
		        System.out.println("Exiting EMS System. Goodbye!");
		        break;

				
				 
			
		}
		
			sc.close();

	}

}
}
