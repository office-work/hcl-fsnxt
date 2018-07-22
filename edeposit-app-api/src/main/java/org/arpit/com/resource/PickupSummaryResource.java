package org.arpit.com.resource;
import org.arpit.com.entity.PickupSummary;
import org.arpit.com.mastersetupapp.entity.ClientMaster;
import org.arpit.com.redis.repository.RedisRepository;
import org.arpit.com.repo.PickupSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class PickupSummaryResource {

	@Autowired
    RedisRepository redisRepository;
	
	@Autowired
	PickupSummaryRepository pickupSummaryRepository;
	

    @GetMapping("/add/{clientCode}/{other}")
    public PickupSummary add(@PathVariable("clientCode") final String clientCode, @PathVariable("other") final String other) {
       PickupSummary pickupSummary = new PickupSummary();
       pickupSummary.setOther(other);
       ClientMaster clientMaster = redisRepository.findByName(clientCode);
       pickupSummary.setClient_id(clientMaster.getId());
       pickupSummaryRepository.save(pickupSummary);
       
       return pickupSummary;
    	
    }

    
}