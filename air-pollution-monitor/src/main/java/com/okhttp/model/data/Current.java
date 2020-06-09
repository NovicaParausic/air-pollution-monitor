package com.okhttp.model.data;

public class Current {

	private Weather weather;
	private Pollution pollution;
	
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public Pollution getPollution() {
		return pollution;
	}
	public void setPollution(Pollution pollution) {
		this.pollution = pollution;
	}
	
	@Override
	public String toString() {
		return "Current [weather=" + weather + ", pollution=" + pollution + "]";
	}	
}
