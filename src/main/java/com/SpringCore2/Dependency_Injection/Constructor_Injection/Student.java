package com.SpringCore2.Dependency_Injection.Constructor_Injection;

public class Student {

	private int id;
	private String name;
	
	public Student(int id , String name) {
		System.out.println("Constructor Injection.......");
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
