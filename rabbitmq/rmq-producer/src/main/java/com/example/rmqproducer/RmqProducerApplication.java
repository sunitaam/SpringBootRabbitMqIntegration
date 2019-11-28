package com.example.rmqproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.rmqproducer.producer.MessageProducer;

@SpringBootApplication
public class RmqProducerApplication {

	@Bean
	MessageProducer messageProducer() {
		return new MessageProducer();
	}
	public static void main(String[] args) {
		SpringApplication.run(RmqProducerApplication.class, args);
	}

}
