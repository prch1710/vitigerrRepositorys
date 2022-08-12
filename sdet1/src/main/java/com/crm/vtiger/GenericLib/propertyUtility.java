package com.crm.vtiger.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertyUtility {
	public String getPropertyKeyValue(String key) throws Throwable 
	{
		FileInputStream fis=new FileInputStream("./data/commandata.properties");
		Properties p=new Properties();
		p.load(fis);
	String value=p.getProperty(key);
	return value;
	
		
	}

}
