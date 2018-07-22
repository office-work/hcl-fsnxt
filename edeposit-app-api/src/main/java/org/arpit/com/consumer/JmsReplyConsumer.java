package org.arpit.com.consumer;

import org.arpit.com.mastersetupapp.entity.ClientMaster;
import org.arpit.com.redis.repository.RedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
 
@Component
public class JmsReplyConsumer {
	
	@Autowired
	RedisRepository redisRepository;
	
	@JmsListener(destination = "${jsa.activemq.queue.listen}", containerFactory="jsaFactory")
	public void receive(ClientMaster clientMasterDto){
		
		// Console Log
		System.out.println("Recieved Message: " + clientMasterDto);
		redisRepository.save(clientMasterDto);
		
	}
}
