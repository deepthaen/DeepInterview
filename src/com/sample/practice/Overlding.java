package com.sample.practice;

public class Overlding {
	 public void interview() {
		 System.out.println("interview");
	 }
public void interview(String jav, int exp) {
		System.out.println(jav + "  "+ exp); 
	 } 
public void interview(String test, int exp, int sal) {
	System.out.println(test + "  "+ exp+ " "+ sal); 
}

public static void main(String[] args) {
	Overlding ol = new Overlding();
	ol.interview();
	ol.interview("java", 3);
	ol.interview("testing", 5, 20000);
}
}
