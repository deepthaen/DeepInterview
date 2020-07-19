package com.sample.practice;

public class Enscap {
	
	public String name;
	public String company;
	public int people;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void getcompany(String company) {
		this.company = company;
		
	}
	
	
	public String setcompany(String company) {
		return company;
					}	
	
	public static void main(String[] args) {
		Enscap e = new Enscap();
		e.setName("Deeptha");
		String n = e.getName();
		System.out.println(n);
		}
}