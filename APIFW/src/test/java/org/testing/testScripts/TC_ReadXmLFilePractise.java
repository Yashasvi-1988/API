package org.testing.testScripts;

import java.io.IOException;

import org.testing.utilities.loadXMLData;

public class TC_ReadXmLFilePractise {

	public static void main(String[] args) throws IOException {
	
		String reponse= loadXMLData.readXmlData("../APIFW/src/test/java/org/testing/Payloads/xmlData.xml");
		System.out.println(reponse);

	}

}
