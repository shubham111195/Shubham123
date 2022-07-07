package com.flights.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.flights.main.model.Flights;
import com.flights.main.service.AirIndiaService;
@CrossOrigin("*")
@RestController
public class Controller
{
	@Autowired 
	AirIndiaService ks;
	
	@PostMapping("/saveFlight")
	public Flights saveFlights(@RequestBody Flights flt )
	{
		ks.saveFlights(flt);
		return flt;
	}
	@RequestMapping(value = "/loginproduking/{username}/{password}", method = RequestMethod.GET)
	public Flights logincheck(@PathVariable("username") String un, @PathVariable("password") String ps)
	// directly required iterable
	{
		Flights stu = ks.logincheck(un, ps);
		Iterable<Flights> list = ks.displayAll();
        
		 return stu;
	}
	@GetMapping("/getList")
	public Iterable<Flights> showFlights()
	{
		return ks.findAllFlights();
	}
	@GetMapping("/getListasperreq/{departureCity}/{arrivalCity}")
	public Iterable<Flights> showFlightsOnRequest(@PathVariable("departureCity") String departureCity,@PathVariable("arrivalCity") String arrivalCity)
	{
		return ks.findFlights(departureCity,arrivalCity);
	}
}
