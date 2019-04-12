package com.trello.regression;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.trello.client.TrelloClient;
import javax.ws.rs.core.Response;


public class CreateCardTest {
	
	
	
	
	@Test
	public void createCard() throws Exception {
		
		TrelloClient restclient = new TrelloClient();
		
		
//		HashMap<String, String> queryparammap = new HashMap<String, String>();
//		queryparammap.put("Content-Type", "application/json");
//		queryparammap.put("key", "4340df9b0a075e0f719eea56103ee185");
//		queryparammap.put("token", "d97c973c30395946886b581f7f883c961e77b01ddf63b27853a436c33222d4f1");
//		queryparammap.put("secret", "adefdbbbddba114a6819205c35d0ae6212797b939793d1cbaa15bf80ca57a076");
//		queryparammap.put("idList", "5ca30ec52c668808ad38f93d");
//		System.out.println(queryparammap);
		
		Response resp= restclient.createCardRestAPI("5ca30ec6f104b374c5832059", "card from new rest assured");
		System.out.println(resp.toString());
		
		
		
	}
	
	
	
	

	
	
}
