package com.example.consumer.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TestConsumer {
	
	// one function per queue to listen to
	@RabbitListener(queues = "testQueue")
	public void receiverMessage(String msg) {
		System.out.println("message: " + msg);
	}
}
