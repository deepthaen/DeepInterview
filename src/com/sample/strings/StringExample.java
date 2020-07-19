package com.sample.strings;

public class StringExample {

	
	
	/**
	 * 
	 * String vs String buffer
	 * String Builder
	 */
	
	public static void main(String[] args) {
		//String is Imutable
		
		String s ="Deep";
		StringBuffer sb = new StringBuffer("jhguy");
		
		//Thread safe
		//Can be modified
		//it s like a String
		//It has predefined methods
		
		sb.reverse();
		
		int i =10;
		String.valueOf(i);
		//but with no guarantee of synchronization
		
	}
}
