package com.SpringCore2.Dependency_Injection.Setter_Injection.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/Dependency_Injection/Setter_Injection/CollectionType/config.xml");
		
		Student std1Obj = appContext.getBean("std1",Student.class);
		
		System.out.println(std1Obj);
		
	}
	
}
