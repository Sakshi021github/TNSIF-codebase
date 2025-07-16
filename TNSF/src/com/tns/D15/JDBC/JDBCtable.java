package com.tns.D15.JDBC;

import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCtable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded successfully");
			
			//step:2 create connection 
			
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dypatil", "root", "root"); // for xamp password is not there then put "" commas
			 System.out.println("Connection created successfully");
			 
			 //step:3 create statement
			 Statement stmt=con.createStatement();
			 
			 System.out.println("Statement created successfully");
			 
			 //step:4 write a query
			 
			 String q="create table student(stdid int, name char, subject varchar, duration double";
			 
			 boolean s=stmt.execute(q);
			 
			 catch
				 
			 }
		}

	}

}
