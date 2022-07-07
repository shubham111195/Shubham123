package com.flights.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.main.model.Flights;
import com.flights.main.repository.Repository;
import com.flights.main.service.AirIndiaService;

@Service
public class ServiceImpl implements AirIndiaService
{
	@Autowired
	Repository kr;
	
	@Override
	public void saveFlights(Flights flt) {
		kr.save(flt);
	}

	@Override
	public Iterable<Flights> findAllFlights() {
		return kr.findAll();
	}

	@Override
	public Iterable<Flights> findFlights(String departureCity, String arrivalCity) {
		
		return kr.findByDepartureCityAndArrivalCity(departureCity, arrivalCity);
	}

	@Override
	public Iterable<Flights> displayAll() {
		Iterable<Flights> itr=kr.findAll();
		return itr;
	}

	@Override
	public Flights logincheck(String un, String ps) {
		return kr.findAllByUsernameAndPassword(un, ps);

	}

}
