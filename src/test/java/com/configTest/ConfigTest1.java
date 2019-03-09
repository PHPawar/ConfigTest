package com.configTest;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigTest1 {
	PropMethod method;
	
	@BeforeTest
	public void setUp()
	{
		method = new PropMethod();
	}
	@Test
	public void test() throws IOException
	{
	  method.readPropFile();	
	  method.writePropFile();
	}
	

}
