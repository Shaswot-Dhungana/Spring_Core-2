package com.SpringCore2.Spring_Bean_Scope.Prototype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*BY Default Singleton is BeanScope*/

@Component("employee")
@Scope("prototype")
public class Emp {

	@Value("1")
	private int id;
	
	@Value("Shaswot Dhungana")
	private String name;
	
	@Value("#{adds}")
	private List<String> address;

	
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

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
}
