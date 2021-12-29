package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonParsing {
	
	public static String jsonParse(String response, String keyname) {
		
		JSONObject obj = new JSONObject (response);
		return obj.get(keyname).toString();
	}
	
public static void jsonParseAllKeys(String response, String keyname) {

	   JSONArray jarry = new JSONArray(response);	   
	   int len = jarry.length();	   
	   for(int i =0; i<len;i++){		   
		   JSONObject obj = jarry.getJSONObject(i);		   
		   System.out.println(obj.get(keyname).toString()); 
	   }
	}

}
