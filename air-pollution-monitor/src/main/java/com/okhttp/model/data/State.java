package com.okhttp.model.data;

import java.util.ArrayList;
import java.util.List;

import com.okhttp.model.ResponseNode;

public class State extends ResponseNode {

	
	private String status;
	private List<Data> data;

	
	public State() {
		super("");
		this.data = new ArrayList<>();
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
