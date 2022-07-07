package com.flights.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.flights.main.model.Flights;

public interface Repository extends CrudRepository<Flights, Integer>
{
	public List<Flights> findByDepartureCityAndArrivalCity(String departureCity,String arrivalCity);

	public Flights findAllByUsernameAndPassword(String un, String ps);
}
