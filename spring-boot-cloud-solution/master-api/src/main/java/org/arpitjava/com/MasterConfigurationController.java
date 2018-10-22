package org.arpitjava.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MasterConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@Autowired
	Environment environment;
	
	@GetMapping(value="/message")
	public MasterConfiguration retriveLimitConfiguration() {
		return new MasterConfiguration(configuration.getMessage());
	}
	
	@GetMapping(value="/cities/{cityName}")
	public City retriveCityByName(@PathVariable String cityName) {
		City city = new City(1l, cityName, true);
		city.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return city;
	}
	
	
}
