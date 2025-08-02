package com.demo.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Demo5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");//Create and Register Driver .It is done automatically
		String user_name="root";
		String password="vivek123";
		String url="jdbc:mysql://localhost:3306/SCEM_DB";
		
		Connection con=DriverManager.getConnection(url,user_name,password);//Establish Connection 
		
		if (con!=null) {
			System.out.println("DB Connected Successfully");
			 
		}
		else {
			System.out.println("Connection Failed");
		
		}
		//CallableStatement cst=con.prepareCall("{call update_student(?)}");
		//CallableStatement cst=con.prepareCall("{call update_student1(?,?)}");
		CallableStatement cst=con.prepareCall("{call getStudent(?,?)}");
		cst.setInt(1, 777);
		cst.registerOutParameter(2,Types.VARCHAR);//All output parameters Must be Registered
		
		
		cst.execute();
		
		System.out.println("Name : "+cst.getString(2));
	con.close();
		
		
		
	}

}
