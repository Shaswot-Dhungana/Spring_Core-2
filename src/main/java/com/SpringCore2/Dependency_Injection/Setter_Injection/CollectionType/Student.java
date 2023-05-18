package com.SpringCore2.Dependency_Injection.Setter_Injection.CollectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String Name;
	private List<String> Address;
	private Set<String> Phone;
	private Map<String , String> Courses;
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getAddress() {
		return Address;
	}
	public void setAddress(List<String> address) {
		Address = address;
	}
	public Set<String> getPhone() {
		return Phone;
	}
	public void setPhone(Set<String> phone) {
		Phone = phone;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Address=" + Address + ", Phone=" + Phone + ", Courses=" + Courses + "]";
	}
	
	
	
	
	
	
}
