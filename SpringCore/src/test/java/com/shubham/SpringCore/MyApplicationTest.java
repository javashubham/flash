package com.shubham.SpringCore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shubham.di.consumer.MyApplication;
import com.shubham.di.services.MessageService;

@Configuration
@ComponentScan(value="com.shubham.di.consumer")
public class MyApplicationTest {
	
	private AnnotationConfigApplicationContext context = null;
	
	@Bean
	public MessageService getMessageService() {
		return new MessageService() {
			
			public boolean sendMessage(String msg, String rec) {
				System.out.println("Mock Service");
				return true;
			}
		};
	}
	
	@Before
	public void setUp() {
		context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
	}
	
	@After
	public void tearDown()
	{
		context.close();
	}
	
	@Test
	public void test() {
		MyApplication app = context.getBean(MyApplication.class);
		Assert.assertTrue(app.processMessage("Personal Message", "abc@gmail.com"));
	}
	
	
	
	@BeforeClass
	public void b4() {
		System.out.println("Before all");
	}
	
	@AfterClass
	public void afterAll() {
		System.out.println("After all");
	}
}
