package com.configTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropMethod {
	Properties prop;
	int propcount;
	public void readPropFile() throws IOException
	{
	File src = new File (System.getProperty("user.dir") +"/config.properties");
	FileInputStream fis = new FileInputStream(src);
    prop = new Properties();
	prop.load(fis);
	System.out.println(prop.getProperty("count"));
	}
	
	public void writePropFile() throws IOException
	{
		File src = new File ((System.getProperty("user.dir")) + "/config.properties");
		FileInputStream fis = new FileInputStream(src);
	    prop = new Properties();
		prop.load(fis);
		FileOutputStream fos = new FileOutputStream(src);
		propcount = Integer.parseInt(prop.getProperty("count"));
		propcount = propcount + 1;
		String count1 = String.valueOf(propcount);
		prop.setProperty("count", count1);
		prop.store(fos, "Prashant Added");
		System.out.println(prop.getProperty("count"));
		
	}

}
