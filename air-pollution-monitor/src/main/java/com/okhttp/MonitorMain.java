package com.okhttp;

import java.io.IOException;

import com.okhttp.model.AvailableCities;
import com.okhttp.model.AvailableCountries;
import com.okhttp.model.AvailableStates;
import com.okhttp.model.InputInfo;
import com.okhttp.model.NearestCity;
import com.okhttp.service.AvailableCitiesStrategy;
import com.okhttp.service.AvailableCountriesStrategy;
import com.okhttp.service.AvailableStatesStrategy;
import com.okhttp.service.MonitorStrategy;
import com.okhttp.service.NearestCityStrategy;

import okhttp3.OkHttpClient;

public class MonitorMain {

	private static OkHttpClient client = new OkHttpClient().newBuilder().build();

	public static void main(String[] args) throws IOException {

		System.out.println("bla bla");

		/*callNearestCity();
		System.out.println();
		
		callAvailableCountries();
		System.out.println();
		*/
		//callAvailableStates();
		System.out.println();
		
		callAvailableCities();
	}

	private static void callNearestCity() {

		MonitorStrategy<NearestCity> strategy = new NearestCityStrategy();
		NearestCity city = strategy.returnResponseNode(client, new InputInfo());// ResponseNode(client, new
																				// InputInfo());

		System.out.println(city.getStatus());
		System.out.println(city.getData());
	}

	private static void callAvailableCountries() {

		MonitorStrategy<AvailableCountries> strategy = new AvailableCountriesStrategy();
		AvailableCountries countries = strategy.returnResponseNode(client, new InputInfo());// ResponseNode(client, new
																							// InputInfo());

		System.out.println(countries.getStatus());
		System.out.println(countries.getData());
	}

	private static void callAvailableCities() {

		MonitorStrategy<AvailableCities> strategy = new AvailableCitiesStrategy();
		AvailableCities cities = strategy.returnResponseNode(client, new InputInfo());// ResponseNode(client, new
																							// InputInfo());

		System.out.println("Status " + cities.getStatus());
		System.out.println(cities.getData());
	}

	private static void callAvailableStates() {

		MonitorStrategy<AvailableStates> strategy = new AvailableStatesStrategy();
		AvailableStates states = strategy.returnResponseNode(client, new InputInfo());// ResponseNode(client, new
																							// InputInfo());

		System.out.println(states.getStatus());
		System.out.println(states.getData());
	}
}
/*
 * 
 * 
 * SimpleEntity entity = callAvailableStates("USA");
 * 
 * for (Data data : entity.getData()) { System.out.println(data.toString()); }
 * 
 * 
 * private final static String KEY =
 * "&key=d5813959-079d-4a07-bde6-0c589307cdb5";
 * 
 * private final static String URL_AVAILABLE_STATES =
 * "http://api.airvisual.com/v2/states?country=";
 * 
 * private final static String URL_AVAILABLE_STATES_SERBIA =
 * "http://api.airvisual.com/v2/states?country=Serbia&key=d5813959-079d-4a07-bde6-0c589307cdb5";
 * 
 * private final static String URL_AVAILABLE_STATES_USA =
 * "http://api.airvisual.com/v2/states?country=USA&key=d5813959-079d-4a07-bde6-0c589307cdb5";
 * 
 * private final static String URL_NEAREST_CITY =
 * "http://api.airvisual.com/v2/nearest_city?key=d5813959-079d-4a07-bde6-0c589307cdb5";
 * 
 */
