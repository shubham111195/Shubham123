package com.flights.main.service;

import com.flights.main.model.Flights;

public interface AirIndiaService {

	public void saveFlights(Flights flt);

	public  Iterable<Flights> findAllFlights();

	public  Iterable<Flights> findFlights(String departureCity, String arrivalCity);

	public  Iterable<Flights> displayAll();

	public  Flights logincheck(String un, String ps);

}
