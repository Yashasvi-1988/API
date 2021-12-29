package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class loadXMLData {
	
	public static String readXmlData (String path) throws IOException {
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		String data ="";
		while( (s =br.readLine()) != null) {			
			//System.out.println(s);
			data=data+s;
		}
		return data;	
	}

}
