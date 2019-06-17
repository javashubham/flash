package com.shubham.di.services;

public class TwitterMessage implements MessageService{
	
	public TwitterMessage(){
		System.out.println("TwitterMessage constructor called ");
	}

	public boolean sendMessage(String msg, String rec) {

		System.out.println("Twitter message Sent to "+rec+ " with Message="+msg);
		return true;
		
	}

}
