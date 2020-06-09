package com.okhttp.service;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.okhttp.model.AvailableCities;
import com.okhttp.model.InputInfo;
import com.okhttp.model.StrategyName;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;

public class AvailableCitiesStrategy implements MonitorStrategy<AvailableCities> {

	private final static String URL_AVAILABLE_CITIES = "http://api.airvisual.com/v2/cities?state=";

	private final static String URL_JOIN = "&country=";

	private ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String concatUrl(InputInfo input) {

		return URL_AVAILABLE_CITIES.concat("Texas") // input.getState())
				.concat(URL_JOIN).concat("USA") // input.getCountry())
				.concat(KEY);
	}

	@Override
	public StrategyName getStrategyName() {

		return StrategyName.AVAILABLE_CITIES;
	}

	@Override
	public AvailableCities returnResponseNode(OkHttpClient client, InputInfo input) {

		AvailableCities node = new AvailableCities();

		try {
			ResponseBody response = httpCall(client, input);
			System.out.println(response.string());
			node = objectMapper.readValue(response.string(), AvailableCities.class);
		} catch (IOException e) {
			System.out.println(e);
		}

		return node;
	}

}
