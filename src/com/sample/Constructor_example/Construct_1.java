package com.sample.Constructor_example;

public class Construct_1 {

	
	int a;
	public Construct_1(){
		a= fetchFile();
		System.out.println("Printing Without Parameter");
	}
	
	public int fetchFile() {
		return 1;
	}
	public void a() {
		System.out.println("a method "+a);
	}
	public void b() {
		System.out.println("b method "+a);
	}
	
	public void c() {
		System.out.println("c method "+a);
	}
}
