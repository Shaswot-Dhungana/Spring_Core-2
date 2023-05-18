package com.SpringCore2.Dependency_Injection.Setter_Injection.Primitive_DataTypes;

public class Student {

	private int id;
	private String Name;
	private String Address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Setter Injection - id.");
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
		System.out.println("Setter Injection - Name.");
	}
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
		System.out.println("Setter Injection - Address.");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	
	
	
}
