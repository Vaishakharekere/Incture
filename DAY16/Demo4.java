package com.demo.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo4 {

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
		String Query="insert into Student values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(Query);//Query are of Same type
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the Choice");
			System.out.println("1.Insert New Record");
			System.out.println("2.Show Result");
			
			int n=sc.nextInt();
			
			if(n==1) {
				System.out.println("Enter ID");
				pst.setInt(1, sc.nextInt());
				System.out.println("Enter Name");
				pst.setString(2,sc.next() );
				System.out.println("Enter City");
				pst.setString(3, sc.next());
				int result=pst.executeUpdate();
				if(result==1)
				System.out.println("Record Inserted Succesfully");
				else
					System.out.println("Record Not Inserted Succesfully");
				
			}
			else if (n==2){
				
				System.out.println("Table Details");
				
				String Query1 ="select * from Student";
				ResultSet rs=pst.executeQuery(Query1);
				
				while(rs.next()) {
					System.out.println("ID: "+rs.getInt(1)+" Name: "+rs.getString(2)+" City: "+rs.getString(3));
				}
				
				System.exit(0);
			}
			else
				{sc.close();
				con.close();
				return;
}}
	}

}
