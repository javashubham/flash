package com.shubham.di.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
	int value() default 1;
}

class Hello{
	@MyAnnotation(value = 10)
	public void sayHello() {
		System.out.println("Hello Annotation ..");
	}
}

public class LRMSDetails {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Hello hel = new Hello();
		Method m = hel.getClass().getMethod("sayHello");
		
		System.out.println(m);
		
		MyAnnotation ann = m.getAnnotation(MyAnnotation.class);
		System.out.println("Value is "+ ann.value());

	}

}
