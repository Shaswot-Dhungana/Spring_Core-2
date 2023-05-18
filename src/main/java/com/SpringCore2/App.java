package com.SpringCore2;

import org.springframework.aop.framework.AopContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		/*
		 * Student1 st = new Student1(); System.out.println("hellow");
		 */

		
		 ApplicationContext appContext = new
		 ClassPathXmlApplicationContext("com/SpringCore2/config.xml");
		 
		 System.out.println("hellow"); 
		 System.out.println(appContext);
		 
		 Student3 std3Obj = appContext.getBean("std3",Student3.class);
		 std3Obj.iMstd3();
		 System.out.println(appContext);
		 
		 

	}
}
