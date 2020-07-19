package com.sample.abstr_clas;

import java.util.List;

public class ExtendsAbstract extends AbstractClass {

	@Override
	void jobid(String id) {
		System.out.println(id);
		
	}

	@Override
	void manager(String s) {
		System.out.println(s);
		
	}

	@Override
	void department(List<String> list) {
		// TODO Auto-generated method stub
		
	}

}
