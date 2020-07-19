package com.sample.polymor;

public class Poly_Overloading {
	//same task into 
	//poly -- many 
	//morphsym -- forms
	
/**
 * compile time -- over loading -- while writing your peace of code in java 
 * 				-- then and there it shows error if it not matches to java library
 * run time -- over riding -- while executiong line by line code
 */
	
	
	//over loadding
	/**
	 * 
	 */
	
	public static void table(String computer) {
		
	}
	
	public static void table() {
		
	}
	
	public static void table(String computer,String mouse,String keyboard) {
		
	}
	
	public static void table(String computer,int penstand) {
		
	}
	
	
	public static void main(String[] args) {
		table("Imac");
		table();
		table("Imac","Mouse","Keyboard");
		table("Computer",2);
	}
	
	
	
	
}
