package org.testing.utilities;

import java.io.*;
import java.util.Properties;


//the purpose of this class is to load the property file

public class LoadPropertiesFile {
	
	public static Properties loadProperties(String path) throws IOException {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fis);		
		return pr;
	}

}
