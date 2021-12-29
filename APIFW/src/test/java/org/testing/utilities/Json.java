package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class Json {
	
	public static String loadJsonFile(String path) throws FileNotFoundException {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		JSONTokener jt = new JSONTokener(fis);
		JSONObject body = new JSONObject(jt);		
		return body.toString();
		
	}

}
