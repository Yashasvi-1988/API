package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.Json;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4 {
	
	 @Test	
	public void TestCase4() throws IOException {
		
		Properties pr =LoadPropertiesFile.loadProperties("../APIFW/URI.properties");	
		String bodyData = Json.loadJsonFile("../APIFW/src/test/java/org/testing/Payloads/bodyDataForUpdate.json");
		bodyData= jsonVariable.jsonVariableReplacement(bodyData, "id", TC1.responseIdvalue);
		//System.out.println("TC4..."+bodyData);
		HttpMethods htmethods = new HttpMethods(pr);		
		Response res = htmethods.putMethod(bodyData, "QA_ENV_APIStudents_URI", TC1.responseIdvalue);
		System.out.println("Status code is : " + res.statusCode());
		System.out.println("Response is :- ");
		System.out.println(res.asString());	
				
		//Response res =htmethods.putMethod("QA_ENV_APIStudents_URI", , );
		
	}

}
