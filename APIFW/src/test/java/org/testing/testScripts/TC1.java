package org.testing.testScripts;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.Json;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.RandomData;
import org.testing.utilities.jsonParsing;
import org.testing.utilities.jsonVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1 {
	static String  responseIdvalue;
	
	 @Test	
	public void testCase1 () throws IOException {	
		
		String bodyData = Json.loadJsonFile("../APIFW/src/test/java/org/testing/Payloads/bodyData.json");
		String randomId= RandomData.random();
		bodyData= jsonVariable.jsonVariableReplacement(bodyData, "id", randomId);
		//System.out.println(bodyData);
		Properties pr =LoadPropertiesFile.loadProperties("../APIFW/URI.properties");		
		HttpMethods htmethods = new HttpMethods(pr);
		Response res = htmethods.PostMethod(bodyData,"QA_ENV_APIStudents_URI");
		
		responseIdvalue= jsonParsing.jsonParse(res.asString(), "id");
	}

}
