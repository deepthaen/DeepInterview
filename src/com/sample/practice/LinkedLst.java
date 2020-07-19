package com.sample.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedLst {
	public static void main(String[] args) {
		List<String> as = new LinkedList<String>();
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
