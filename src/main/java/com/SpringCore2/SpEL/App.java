package com.SpringCore2.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/SpEL/config.xml");
		
		Student st = appContext.getBean("student", Student.class);
		
		System.out.print(st);
		
	}
	
}
