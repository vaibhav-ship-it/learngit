package org.gitsample;

public class Company {
	

	//Change 2

	//Change 1

	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + "]";
	}
	
}
