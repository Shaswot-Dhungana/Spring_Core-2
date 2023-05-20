package com.SpringCore2.Spring_LifeCycle.LifeCycle_Interface;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/Spring_LifeCycle/LifeCycle_Interface/config.xml");
		appContext.registerShutdownHook();
		
		Student std = appContext.getBean("myBean", Student.class);
		System.out.println(std);
	}
	
	
}
