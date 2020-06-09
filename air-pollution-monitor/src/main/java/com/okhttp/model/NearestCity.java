package com.okhttp.model;

import com.okhttp.model.data.Data;

public class NearestCity extends ResponseNode {

	
	private Data data;
	
	public NearestCity() {
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
