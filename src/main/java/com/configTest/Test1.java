package com.configTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo", "root", "Shreya@0506");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from configTest");
		rs.next();
		System.out.println(rs.getString("count"));
	}

}
