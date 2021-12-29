package org.testing.testSteps;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethods {
	
	Properties pr;
	
	public HttpMethods(Properties pr) {
		this.pr=pr;		
	}
	
	public Response PostMethod(String bodydata, String uriKey ) {
		
		Response res =
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(uriKey));		
		System.out.println("Status code is" + res.statusCode());		
		return res;
	
	}
	public Response getMethod(String urikey, String id) {
		
		String uri =pr.getProperty(urikey)+"/"+id;
		Response res= 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		return res;
		
	}

	public Response getAll(String urikey) {		
		String uri= pr.getProperty(urikey);		
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);		
		return res;
	}

	public Response putMethod(String bodydata, String uriKey, String idValue) {		
		String uri =pr.getProperty(uriKey)+"/"+idValue;
		Response res= 
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.put(uri);
		return res;
	}

	public Response deleteRecordMethod(String uriKey, String idValue) {
		
		String uri =pr.getProperty(uriKey)+"/"+idValue;
		Response res= 
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);		
	
		return res;
	}

}
