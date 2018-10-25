package org.arpitjava.com;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdepositConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@Autowired
	CityServiceProxy proxy;
	
	@GetMapping(value="/message")
	public EdepositConfiguration retriveLimitConfiguration() {
		return new EdepositConfiguration(configuration.getMessage());
	}
	
	@GetMapping(value="/states/{stateName}/city/{cityName}")
	public State retriveStateWithCityByName(@PathVariable String stateName,@PathVariable String cityName) {
		State state = new State();
		state.setId(1l);
		state.setActive(true);
		state.setStateName(stateName);
		City city = proxy.retriveCityByName(cityName);
		state.setCities(Arrays.asList(city));
		return state;
	}
	
	
}
