package com.SpringCore2.AutoWiring.AutoWiring_Annotations.Autowired_in_Constructors;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	
	private Address address;

	
	// Constructor
	@Autowired
	 public Student(Address address) { super(); this.address = address;
	 System.out.println("Constructor Injection { AutoWired }"); }


	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	
}
