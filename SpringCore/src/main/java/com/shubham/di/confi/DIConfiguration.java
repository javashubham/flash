package com.shubham.di.confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shubham.di.consumer.MyPrivateClas;
import com.shubham.di.services.EmailMessage;
import com.shubham.di.services.MessageService;
import com.shubham.di.services.TwitterMessage;

@Configuration
@ComponentScan(value = "com.shubham.di.consumer")
public class DIConfiguration {

	@Bean
	public MyPrivateClas getMessageService() {
		return new MyPrivateClas();
	}
	
	@Bean(name="asdf")
	public MessageService getMessService() {
		return new TwitterMessage();
	}
	
	@Bean(name="xyz")
	public MessageService getMessService1() {
		return new EmailMessage();
	}
	
	
}
