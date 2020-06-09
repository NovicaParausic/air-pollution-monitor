package com.okhttp.model;

public abstract class ResponseNode {


	private String status;
	
	public ResponseNode(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
