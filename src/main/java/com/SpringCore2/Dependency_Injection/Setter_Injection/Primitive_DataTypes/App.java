package com.SpringCore2.Dependency_Injection.Setter_Injection.Primitive_DataTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
	
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringCore2/Dependency_Injection/Setter_Injection/Primitive_DataTypes/config.xml");
		
        Student stdObj1 = appContext.getBean("std1",Student.class);
        
        System.out.println(stdObj1);
		
		
        Student stdObj2 = appContext.getBean("std2",Student.class);
        
        System.out.println(stdObj2);
        
        
	}
	
}
