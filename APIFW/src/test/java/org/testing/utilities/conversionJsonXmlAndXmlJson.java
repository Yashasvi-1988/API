package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class conversionJsonXmlAndXmlJson {
	
	public static String xmlToJson(String xmlData) {		
		JSONObject ob = XML.toJSONObject(xmlData);		
		//System.out.println(ob.toString());		
		return ob.toString();		
	}
	
    public static String JsonToXml(String jsonData) {
    	
    	JSONObject ob = new JSONObject(jsonData);
    	String xmlData = XML.toString(ob);
    	return xmlData;
		
	}

}
