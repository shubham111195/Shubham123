package com.flights.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flights
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String flightDate;
	private String arrivalCity;
	private String departureCity;
	private String filghtTime;
	private String username;
	private String password;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getFilghtTime() {
		return filghtTime;
	}
	public void setFilghtTime(String filghtTime) {
		this.filghtTime = filghtTime;
	}
	
}
