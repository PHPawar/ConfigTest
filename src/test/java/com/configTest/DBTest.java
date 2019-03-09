package com.configTest;

import java.sql.SQLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DBTest {
	DBMethod db;
	
	@BeforeTest
	public void setUp()
	{
		db = new DBMethod();
	}
	@Test
	public void dbTest() throws SQLException
	{
		db.readDB();
		db.writeDB();
	}

}
