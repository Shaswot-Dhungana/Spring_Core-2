package com.SpringCore2.AutoWiring.AutoWiring_Annotations.Autowired_in_Property;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	private Address address;

	
	// Constructor
	/*
	 * public Student(Address address) { super(); this.address = address;
	 * System.out.println("Constructor Injection { AutoWired }"); }
	 */


	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	
}
