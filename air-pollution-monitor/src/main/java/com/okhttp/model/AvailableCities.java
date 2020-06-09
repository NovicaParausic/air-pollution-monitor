package com.okhttp.model;

import java.util.ArrayList;
import java.util.List;

import com.okhttp.model.data.City;

public class AvailableCities extends ResponseNode {

	
	private List<City> data;
	
	
	public AvailableCities() {
		super("");
		this.data = new ArrayList<City>();
	}


	public List<City> getData() {
		return data;
	}


	public void setData(List<City> data) {
		this.data = data;
	}
	
}
