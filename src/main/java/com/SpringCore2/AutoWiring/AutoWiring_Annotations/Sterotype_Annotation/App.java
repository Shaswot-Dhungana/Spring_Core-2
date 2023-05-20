package com.SpringCore2.AutoWiring.AutoWiring_Annotations.Sterotype_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/AutoWiring/AutoWiring_Annotations/Sterotype_Annotation/config.xml");
		
		Emp e = appContext.getBean("employee",Emp.class);
		
		System.out.println(e);
		
	}
	
}
