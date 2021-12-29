package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2 {
	 @Test	
	public void TestCase2() throws IOException {
		
		Properties pr =LoadPropertiesFile.loadProperties("../APIFW/URI.properties");		
		HttpMethods htmethods = new HttpMethods(pr);
		Response res =htmethods.getMethod("QA_ENV_APIStudents_URI", TC1.responseIdvalue);
		System.out.println("Status code is :");
		System.out.println(res.statusCode());
		System.out.println("Response is ");
		System.out.println(res.asString());
	}

}
