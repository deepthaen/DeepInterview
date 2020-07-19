package com.sample.interf;

import java.util.List;
import java.util.Random;

public class ImplementInter implements Inster {

	@Override
	public void JobId(String id) {
		System.out.println("job id "+id);
		
	}

	@Override
	public void department(List<String> list) {
		System.out.println("department "+list);
	}

	@Override
	public void floor(int flor) {
		System.out.println("floor "+flor);
	}

	@Override
	public void laptop(List<String> list) {
		
	}

	@Override
	public void Manager(String man) {
		// TODO Auto-generated method stub
		
	}

	

}
