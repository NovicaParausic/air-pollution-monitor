package com.okhttp.service;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.okhttp.model.AvailableStates;
import com.okhttp.model.InputInfo;
import com.okhttp.model.StrategyName;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;

public class AvailableStatesStrategy implements MonitorStrategy<AvailableStates> {

	
	private final static String URL_AVAILABLE_STATES = "http://api.airvisual.com/v2/states?country=";
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	public String concatUrl(InputInfo input) {
		return URL_AVAILABLE_STATES.
					concat("USA")  //input.getCountry())
					  .concat(KEY);
	}

	@Override
	public StrategyName getStrategyName() {
		
		return StrategyName.AVAILABLE_STATES;
	}

	@Override
	public AvailableStates returnResponseNode(OkHttpClient client, InputInfo input) {

		ResponseBody response = httpCall(client, input); 
		AvailableStates  node = new AvailableStates();
		
		try {
			 node = objectMapper.readValue(response.string(), AvailableStates.class);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		return node;
	}

}
