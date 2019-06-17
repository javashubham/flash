package com.shubham.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shubham.di.confi.DIConfiguration;
import com.shubham.di.consumer.MyApplication;

public class ClientApplication {

	int var1 = 10;
	int var2 = 20;
	
	
	public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public int getVar2() {
		return var2;
	}
	public void setVar2(int var2) {
		this.var2 = var2;
	}
	
	
	
	
	
	
}
