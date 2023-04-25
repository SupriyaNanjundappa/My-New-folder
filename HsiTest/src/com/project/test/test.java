package com.project.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo";
		String username= "root";
		String password = "root123";
		Connection connection = null;
		try { 
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is success");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
