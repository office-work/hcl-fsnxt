package org.arpitjava.com;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="master-api")
@RibbonClient(name="master-api")
public interface CityServiceProxy {
	
	@GetMapping(value="/cities/{cityName}")
	public City retriveCityByName(@PathVariable String cityName);
}
