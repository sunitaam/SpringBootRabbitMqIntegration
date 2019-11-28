package com.example.rmqproducer.producer;

import java.util.Date;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.rmqproducer.config.RmqConfig;

public class MessageProducer {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendMessage(String message) {
		System.out.println(new Date());
		rabbitTemplate.convertAndSend(RmqConfig.ROUTING_KEY, message);
		System.out.println("Is listerner returned" + rabbitTemplate.isReturnListener());
	}
}
