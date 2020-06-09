package com.okhttp.model;

import com.okhttp.model.data.Data;

public class AvailableCountries extends ResponseNode {

	
	private Data data;
	
	public AvailableCountries() {
		super("");
		this.data = new Data();
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
}
