package com.sample.practice;

import java.util.ArrayList;

public class Arraylst {
	
	public static void main(String[] args) {
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("deep");
		as.add("lucky");
		as.add("ram");
		as.add("devil");
		
		for(String i: as) {
			System.out.println(i);
		}
		as.set(2, "deepu");
		for(String i: as) {
			System.out.println(i);
		}
		as.remove(1);
		for(String i: as) {
			System.out.println(i);
		}
	}

}
