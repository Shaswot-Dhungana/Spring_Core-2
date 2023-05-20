package com.SpringCore2.Dependency_Injection.Constructor_Injection.Ambiguity_Problem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/Dependency_Injection/Constructor_Injection/Ambiguity_Problem/config.xml");
		
		Sum sum = appContext.getBean("sum",Sum.class);
		
		
	}
	
}
