package com.shubham.di.test;

public  class Base {
	/*
	Base(){
		System.out.println("Base Class Constructor");
	}
	abstract void fun();
	void noFun() {
		System.out.println("No Fun");
	}*/
	protected int a = 10;
	
	protected String getProtected() {
		return "Got a value from Protected::::";
	}
	
	public String getPPublic() {
		return "Got a value from Public method::::";
	}
}
