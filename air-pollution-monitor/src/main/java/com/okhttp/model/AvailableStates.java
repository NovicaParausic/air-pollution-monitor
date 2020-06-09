package com.okhttp.model;

import com.okhttp.model.data.Data;

public class AvailableStates extends ResponseNode {

private Data data;
	
	public AvailableStates() {
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

