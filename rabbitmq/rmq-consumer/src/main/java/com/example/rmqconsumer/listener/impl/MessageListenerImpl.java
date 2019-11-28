package com.example.rmqconsumer.listener.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.example.rmqconsumer.listener.MessageListener;

@Component
public class MessageListenerImpl implements MessageListener {

	@Override
	public void onMessage(String message) {
		System.out.println(new Date());
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("msg received" + message);
	}
}
