package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonParsing;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3 {
	 @Test	
	public void TestCase3() throws IOException {	
	
	Properties pr =LoadPropertiesFile.loadProperties("../APIFW/URI.properties");		
	HttpMethods htmethods = new HttpMethods(pr);
	Response res = htmethods.getAll("QA_ENV_APIStudents_URI");
	System.out.println("Status code is :" + res.statusCode());
	System.out.println("Response is ");
	System.out.println(res.asString());	
	System.out.println("Printing all the ids");	
	jsonParsing.jsonParseAllKeys(res.asString(), "id");
	
	}

}
