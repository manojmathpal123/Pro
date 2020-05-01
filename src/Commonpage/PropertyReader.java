package Commonpage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public PropertyReader(String flename)
	{
		this.filename =filename;
	}
	
	private String filename;
	
	public String readapplicationfile(String key)
	{
		String value ="";
	try {	
		Properties prop = new Properties();
		File f = new File(System.getProperty("user.dir") + "\\src\\Config\\application.properties");
		if(f.exists())
		{
			prop.load(new FileInputStream(f));
			value = prop.getProperty(key);
		}
		
	}
	catch (Exception e) {
		System.out.println("failed to read application file");
	}
		
		return value;
		
	}

}
