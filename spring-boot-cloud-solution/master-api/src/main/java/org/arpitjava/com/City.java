package org.arpitjava.com;

public class City {

	private long id;
	private String cityName;
	private boolean isActive;
	private int port;
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public City(long id, String cityName, boolean isActive) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.isActive = isActive;
	}
	
	

}
