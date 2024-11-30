package com.login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class LogService {
  public boolean check(String uname,String pass) {
		try  
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newclient","root","Newuser");

			PreparedStatement pst=connection.prepareStatement("Select * from newclient.library1 where Username=? and Password=?");
			pst.setString(1, uname);
			pst.setString(2, pass);
			ResultSet rs=pst.executeQuery();
		
			if (rs.next())

			{
				
			return true;
			}
		}
		catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		    
			return false;
		
}
}
  