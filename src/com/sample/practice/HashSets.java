package com.sample.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class HashSets {
	public static void main(String[] args) {
		
	
	
	HashSet<String> s = new HashSet<String>();
	
	s.add("One");   
    s.add("Two");    
    s.add("Three");   
    s.add("Four");  
    s.add("Five");
    
    Iterator<String> i=s.iterator();  
    while(i.hasNext()) {
    	System.out.println(i.next());
    }
    }
    
	
}
