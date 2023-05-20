package com.SpringCore2.AutoWiring.AutoWiring_XML.byConstructor;


public class Student {

	private Address address;

	
	// Constructor
	public Student(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor Injection { AutoWired }");
	}



	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	
}
