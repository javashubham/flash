package com.shubham.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shubham.di.services.MessageService;

@Component
@Scope(value="singleton")
public class MyApplication {

	private MessageService messageService;
	
	MyApplication(){
		System.out.println("Main Constructor Called");
	}
	
	@Autowired
	@Qualifier("xyz")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public boolean processMessage(String msg, String rec) {
		return messageService.sendMessage(msg, rec);
	}
	
}
