package com.trello.regression;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class AddLabelToCardTest {
	
	static String BASE_URI="https://api.trello.com";
	static String PATH_NAME="/1/cards";
	
	@Test(priority=1)
	public static void post()
	{
		
			System.err.println("@POST");
			System.out.println(""); 
			Client client = Client.create();

			WebResource webResource = client.resource(BASE_URI+ PATH_NAME);
		
			ClientResponse postresponse1=webResource.queryParam("key", "4340df9b0a075e0f719eea56103ee185")
    		.queryParam("token", "d97c973c30395946886b581f7f883c961e77b01ddf63b27853a436c33222d4f1")
    		.queryParam("secret", "adefdbbbddba114a6819205c35d0ae6212797b939793d1cbaa15bf80ca57a076")
    		.queryParam("idList", "5ca30ec6f104b374c5832059")
    		.queryParam("name", "card from jersy")
    		.type("application/json")
    		.post(ClientResponse.class);
			
			int statusCode = postresponse1.getStatus();
			System.out.println(statusCode);
			
			Assert.assertEquals(statusCode, 200);		
	}
}