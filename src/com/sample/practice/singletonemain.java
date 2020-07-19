package com.sample.practice;

public class singletonemain {
	public static void main(String[] args) {
		singleton se = singleton.getInstance(); 
		singleton se1 = singleton.getInstance(); 
		System.out.println(se.s);
		System.out.println(se1.s);
		
		  
		
	}

}
