package com.SpringCore2.Dependency_Injection.Setter_Injection.ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/Dependency_Injection/Setter_Injection/ReferenceType/config.xml");
		
		Student stdObj = appContext.getBean("Std",Student.class);
		
		System.out.println(stdObj.getName());
		System.out.println(stdObj.getAddress().getId());
		System.out.println(stdObj.getAddress().getCity());
	
		
		
		
	}
	
}
