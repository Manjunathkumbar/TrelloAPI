package com.trello.client;




import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.RequestEntityProcessing;
import org.glassfish.jersey.client.filter.EncodingFilter;
import org.glassfish.jersey.message.GZipEncoder;
import org.testng.annotations.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.header.MediaTypes;



public class TrelloClient 
{
	
	static String BASE_URI="https://api.trello.com";
	//static String PATH_NAME="/1/cards";
	
	
	public ClientResponse createCardRestAPI(String id,  String name) throws Exception
	{
		
		String PATH_NAME="/1/cards";
		System.err.println("@POST");
		System.out.println(""); 
		
		Client client = Client.create();

		WebResource webResource = client.resource(BASE_URI+ PATH_NAME);
		ClientResponse postresponse1=webResource
		.queryParam("key", "4340df9b0a075e0f719eea56103ee185")
		.queryParam("token", "d97c973c30395946886b581f7f883c961e77b01ddf63b27853a436c33222d4f1")
		.queryParam("secret", "adefdbbbddba114a6819205c35d0ae6212797b939793d1cbaa15bf80ca57a076")
		.queryParam("idList", id)
		.queryParam("name", name)
		.type("application/json")
		.post(ClientResponse.class);
		
		return postresponse1;
	}
}