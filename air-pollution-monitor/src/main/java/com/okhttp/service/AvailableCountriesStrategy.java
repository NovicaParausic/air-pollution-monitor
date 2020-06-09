package com.okhttp.service;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.okhttp.model.AvailableCountries;
import com.okhttp.model.InputInfo;
import com.okhttp.model.StrategyName;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;

public class AvailableCountriesStrategy implements MonitorStrategy<AvailableCountries> {

	
	private final static String URL_AVAILABLE_COUNTRIES= "http://api.airvisual.com/v2/countries?key=";
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	public String concatUrl(InputInfo input) {
		
		return URL_AVAILABLE_COUNTRIES.concat(KEY);
	}

	@Override
	public StrategyName getStrategyName() {
		
		return StrategyName.AVAILABLE_COUNTRIES;
	}

	@Override
	public AvailableCountries returnResponseNode(OkHttpClient client, InputInfo input) {
		
		ResponseBody response = httpCall(client, input); 
		AvailableCountries  node = new AvailableCountries();
		
		try {
			 node = objectMapper.readValue(response.string(), AvailableCountries.class);
		} catch (IOException e) {
			
		}
		
		return node;
	}

	

}
