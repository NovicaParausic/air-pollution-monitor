package com.okhttp.service;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.okhttp.model.InputInfo;
import com.okhttp.model.ResponseNode;
import com.okhttp.model.StrategyName;
import com.okhttp.model.data.State;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

public interface MonitorStrategy <T extends ResponseNode> {

	
	final static String KEY = "&key=d5813959-079d-4a07-bde6-0c589307cdb5";
	
	//TODO: Question: what is proper way to store private final static String 
	//to be available from anywhere in application
	
	default ResponseBody httpCall(OkHttpClient client, InputInfo input) {

		final String url = concatUrl(input);
		Request request = new Request.Builder().url(url).method("GET", null).build();
		
		ResponseBody response = null;
		//State entity = null;
		//ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			response = client.newCall(request).execute().body();
			//entity = objectMapper.readValue(response.string(), Class<T>);
			
		} catch (IOException e) {
			System.out.println(e);
			return null;
		}
		
		return response;
	}
	
	String concatUrl(InputInfo input);
	
	StrategyName getStrategyName();
	
	T returnResponseNode(OkHttpClient client, InputInfo input);	
}	

/*
default ResponseNode httpCall(OkHttpClient client, InputInfo input) {

		final String url = concatUrl(input);
		Request request = new Request.Builder().url(url).method("GET", null).build();
		
		ResponseBody response = null;
		State entity = null;
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			response = client.newCall(request).execute().body();
		
			entity = objectMapper.readValue(response.string(), State.class);
		} catch (IOException e) {
			System.out.println(e);
			return new State();
		}
		return entity;
	}
	
	String concatUrl(InputInfo input);
	
	StrategyName getStrategyName();
*/