package com.SpringCore2.AutoWiring.AutoWiring_XML.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/AutoWiring/AutoWiring_XML/byName/config.xml");
		
		Student student = appContext.getBean("stds", Student.class);
		
		System.out.println(student);
		
		
		
	}
	
}
