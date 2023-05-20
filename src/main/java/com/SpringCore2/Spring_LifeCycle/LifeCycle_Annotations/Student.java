package com.SpringCore2.Spring_LifeCycle.LifeCycle_Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class Student {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

	@PostConstruct
	public void init() {
		System.out.println("Object initialized...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Object Destroyed...");	
	}
	
	
}
