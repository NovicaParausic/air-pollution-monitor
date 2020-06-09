package com.okhttp.model.data;

public class Data {

	private String city;
	private String state;
	private String country;
	private Location location;
	private Current current;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Current getCurrent() {
		return current;
	}
	public void setCurrent(Current current) {
		this.current = current;
	}
	
	public String cityToString() {
		return "Data [city = " + city + "]";
	}

	public String stateToString() {
		return "Data [state= " + state + "]";
	}
		
	public String countryToString() {
		return "Data [country = " + country + "]";
	}
	@Override
	public String toString() {
		return "Data [city=" + city + ", state=" + state + ", country=" + country + ", location=" + location
				+ ", current=" + current + "]";
	}	
}
