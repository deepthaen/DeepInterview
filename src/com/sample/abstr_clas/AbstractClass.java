package com.sample.abstr_clas;

import java.util.List;

public abstract class AbstractClass {

	
	abstract void jobid(String id);
	abstract void manager(String s);
	
	int floor() {
		System.out.println(10);
		return 10;
	}
	
	abstract void department(List<String> list);
}
