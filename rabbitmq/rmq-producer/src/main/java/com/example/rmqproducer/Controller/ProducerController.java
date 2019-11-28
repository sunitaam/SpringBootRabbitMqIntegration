package com.example.rmqproducer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rmqproducer.producer.MessageProducer;

@RestController
@RequestMapping("/producer")
public class ProducerController {

	@Autowired
	MessageProducer messageProducer;
	@GetMapping
	public String produce(@RequestParam String message) {
		messageProducer.sendMessage(message);
		return "message sent to RabbitMQ & msg = " + message;
	}
}
