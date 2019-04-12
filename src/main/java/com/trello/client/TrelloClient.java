package com.trello.client;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.RequestEntityProcessing;
import org.glassfish.jersey.client.filter.EncodingFilter;
import org.glassfish.jersey.message.GZipEncoder;

import com.sun.jersey.core.header.MediaTypes;



public class TrelloClient 
{
	
	public Response createCardRestAPI(String id,  String name) throws Exception{
		Response response = null;
	    Client client = ClientBuilder.newBuilder().build();
	    String createCardUrl = getBaseURI() + "/1/cards";
	    WebTarget webTarget = client.target(createCardUrl)
	    		.queryParam("key", "4340df9b0a075e0f719eea56103ee185")
	    		.queryParam("token", "d97c973c30395946886b581f7f883c961e77b01ddf63b27853a436c33222d4f1")
	    		.queryParam("secret", "adefdbbbddba114a6819205c35d0ae6212797b939793d1cbaa15bf80ca57a076")
	    		.queryParam("idList",id)
	    		.queryParam("name", name);
	    		
	    String payLoad = null;
	    response = webTarget.request().header("Content-Type", MediaType.APPLICATION_JSON)
	    		.post(null, Response.class);
	    return response;
	}
	
	public String getBaseURI() 
	{
		String url = null;
		url = "https://api.trello.com";
		
		return url;	
	}
	
	/*public MultivaluedMap<String, String> getQueryParams() {
		
		MultivaluedMap<String, String> params = new MultivaluedMapImpl();
		
		params.add("key", "4340df9b0a075e0f719eea56103ee185");
		params.add("token", "d97c973c30395946886b581f7f883c961e77b01ddf63b27853a436c33222d4f1");
		params.add("secret", "adefdbbbddba114a6819205c35d0ae6212797b939793d1cbaa15bf80ca57a076");
		
		return params;
		
	}*/
}
