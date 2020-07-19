package com.sample.practice;

public abstract class Abstrction {
	
	void dispaly() {
		System.out.println("display");
	}
	static int n;
	
	static void show() {
		System.out.println("show static");
	}
	abstract void write() ;
	abstract void pen();

}
