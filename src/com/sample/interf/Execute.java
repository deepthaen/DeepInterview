package com.sample.interf;

import java.util.ArrayList;
import java.util.List;

public class Execute {
	static Inster a;
	public static void main(String[] args) {
		deeptha();
		hari();

	}


	public static void deeptha() {
		List<String> list = new ArrayList<String>();
		list.add("IT");
		list.add("DEV");
		a = new ImplementInter();
		a.JobId("deep1234");
		a.floor(10);
		a.department(list);
		
		System.out.println("******************");
	}
	public static void hari() {
		List<String> list = new ArrayList<String>();
		list.add("AI");
		list.add("DEV");
		a = new ImplementInter();
		a.JobId("Hari1234");
		a.floor(11);
		a.department(list);
	}
}
