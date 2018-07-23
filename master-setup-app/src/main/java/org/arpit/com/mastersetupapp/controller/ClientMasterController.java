package org.arpit.com.mastersetupapp.controller;

import org.arpit.com.mastersetupapp.entity.ClientMaster;
import org.arpit.com.mastersetupapp.producer.JmsProducer;
import org.arpit.com.mastersetupapp.repo.ClientMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientMasterController {

	@Autowired
	JmsProducer producer;
	
	@Autowired
	ClientMasterRepository clientMasterRepository;
	
	@RequestMapping(value = "/ex/foos/{msg}", method = RequestMethod.GET)
	public String sendtoJMS(@PathVariable("msg") String msg) {
		ClientMaster clientMaster = new ClientMaster();
		clientMaster.setClientCode("ABCD");
		clientMaster.setClientName("Arpit Kumar");
		clientMasterRepository.save(clientMaster);
		producer.send(clientMaster);
		
		return msg +" msg is going to jms mq";
	}

}
