package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb9am", "root", "");
		String sql = "select id from user where username = 'asee' ";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			System.out.println("Id " + rs.getInt("id"));
//			System.out.println("UserName " + rs.getString("username"));
			//System.out.println("Password " + rs.getString("password"));
			//System.out.println("========================================================");

		}
	}
}
