package com.SpringCore2.Spring_LifeCycle.LIfeCycle_XML;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/Spring_LifeCycle/LIfeCycle_XML/config.xml");
		appContext.registerShutdownHook();
		
		Student std = appContext.getBean("myBean", Student.class);
		System.out.println(std);
	}
	
	
}
