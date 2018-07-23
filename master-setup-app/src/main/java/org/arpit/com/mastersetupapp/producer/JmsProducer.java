package org.arpit.com.mastersetupapp.producer;

import org.arpit.com.mastersetupapp.entity.ClientMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

 
@Component
public class JmsProducer {
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${jsa.activemq.queue.producer}")
	String queue;
	
	public void send(ClientMaster clientMaster){
		jmsTemplate.convertAndSend(queue, clientMaster);
		
		/*jmsTemplate.convertAndSend(queue, clientMaster, new MessagePostProcessor() {
	        public Message postProcessMessage(Message message) throws JMSException {
	            message.setStringProperty("company", companyName);
	            return message;
	        }
	    });*/
	}
}