package com.SpringCore2.Spring_Bean_Scope.Prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/Spring_Bean_Scope/Prototype/config.xml");
		
		Emp e1 = appContext.getBean("employee",Emp.class);
		System.out.println(e1);
		System.out.println(e1.hashCode());
		
		Emp e2 = appContext.getBean("employee",Emp.class);
		System.out.println(e2);
		System.out.println(e2.hashCode());
		
		
	}
	
}
