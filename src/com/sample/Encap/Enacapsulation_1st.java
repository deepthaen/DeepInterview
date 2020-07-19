package com.sample.Encap;

public class Enacapsulation_1st {
	
	/**
	 * Wrapping code and data
	 * 
	 * binding data members and member function
	 */
	
	// we call as setters and getter
	
	public String name;
	public int age;
	public String company;
	public long salary;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Enacapsulation_1st e = new Enacapsulation_1st();
		e.setName("Deeptha");
		e.getName();
		
		System.out.println(e.getName());
	}
	
	

}
