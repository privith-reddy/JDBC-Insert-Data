package com.domain;

import java.sql.*;

public class MyProgram 
{
	public static void main(String[] args) 
	{
		// Inserting data manually into employee table
		try 
		{
			//step 1: Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2: Establish connection to database
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/palle","root","sadhu");
			 
			 //step 3: Prepare SQL statement 
			 Statement s = con.createStatement();
			 
			 //step 4: Execute query
			 
			 //s.executeUpdate("insert into employee values(1,'Vamshi','Bangalore')");
			 //s.executeUpdate("insert into employee values(2,'Shiva','Hyderabad')");
			 //s.executeUpdate("insert into employee values(3,'Privith','Mumbai')");
			 
			 //s.executeUpdate("update employee set ename = 'sai', ecity = 'Pune' where eid = 1");
			 
			 s.executeUpdate("delete from employee where eid = 1");
			 
			 
			 //step 5: Closing connection and statement
			 s.close();
			 con.close();
			 
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	

	}

}
