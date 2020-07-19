package com.sample.eachloop;

import java.util.List;

public class EachLooping {
	
	
	public static void forloop(int a) {
		for (int i = 0; i < a; i++) {
			System.out.println(i);
		}
	}
	
	public static void for_each_loop(int[] a) {
		for (Integer i : a) {
			System.out.println(i);
		}
	}

	
	public static void main(String[] args) {
		int a =10;
		int[] b = {1,2,3,4,5,6,7,8,9};
		
		//forloop(a);
		for_each_loop(b);
		
		
	}
}
