package com.SpringCore2.Dependency_Injection.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/Dependency_Injection/Constructor_Injection/config.xml");
		
		Student stdObj = appContext.getBean("std", Student.class);
		
		System.out.println(stdObj);
		
		
	}
	
}
