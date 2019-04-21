package com.trello.regression;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.jersey.api.client.ClientResponse;
import com.trello.client.TrelloClient;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


public class CreateCardTest {
	
	
	@Test
	public void createCard() throws Exception {
		
		TrelloClient restclient = new TrelloClient();
		
		ClientResponse resp= restclient.createCardRestAPI("5ca30ec6f104b374c5832059", "card from new jersey");
		 int statuscode = resp.getStatus();
		 resp.getEntity(String.class);
		 System.out.println(resp.toString());
		 Assert.assertEquals(statuscode, 200);
		 System.out.println(resp.getCookies());
		MultivaluedMap<String, String> hd = resp.getHeaders();
		System.out.println(hd);		
	}	
}