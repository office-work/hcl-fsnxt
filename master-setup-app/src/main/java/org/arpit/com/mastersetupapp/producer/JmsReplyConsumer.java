/*package org.arpit.com.mastersetupapp.producer;

import org.arpit.com.mastersetupapp.entity.ClientMaster;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
 
@Component
public class JmsReplyConsumer {
	
	@JmsListener(destination = "${jsa.activemq.queue.producer}", containerFactory="jsaFactory")
//	@SendTo("${jsa.activemq.queue.sendto}")
	public void receive(ClientMaster clientMasterDto){
		
		// Console Log
		System.out.println("Recieved Message: " + clientMasterDto);
		
		// set company
		Company apple = new Company("Apple");
		product.setCompany(apple);
		
		Message<Product>  mesage = MessageBuilder
	            .withPayload(product)
	            .setHeader("type", product.getType())
	            .build();
		
//		return mesage;	
	}
}
*/