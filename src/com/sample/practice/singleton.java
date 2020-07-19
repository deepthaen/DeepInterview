package com.sample.practice;

public class singleton {
	
	private static singleton single_instance = null;
	private String s;
	 private singleton() {
		 s = "single ton class";
	 }
		
		public static singleton getInstance() 
		    { 
		        if (single_instance == null) 
		            single_instance = new singleton(); 
		  
		        return single_instance; 
		    } 
		} 
		  