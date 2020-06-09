package com.okhttp.service;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.okhttp.model.InputInfo;
import com.okhttp.model.NearestCity;
import com.okhttp.model.StrategyName;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;

public class NearestCityStrategy implements MonitorStrategy<NearestCity> {

	private final static String URL_NEAREST_CITY = "http://api.airvisual.com/v2/nearest_city?key=d5813959-079d-4a07-bde6-0c589307cdb5";

	private ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	public String concatUrl(InputInfo input) {

		return URL_NEAREST_CITY;
	}

	@Override
	public StrategyName getStrategyName() {

		return StrategyName.NEAREST_CITY;
	}

	@Override
	public NearestCity returnResponseNode(OkHttpClient client, InputInfo input) {
		
		ResponseBody response = httpCall(client, input); 
		NearestCity  node = new NearestCity();
		
		try {
			 node = objectMapper.readValue(response.string(), NearestCity.class);
		} catch (IOException e) {
			
		}
		
		return node;
	}

}
