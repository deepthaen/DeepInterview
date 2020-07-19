package com.sample.polymor;

public class Poly_OverRiding {
	
	public static void main(String[] args) {
		father f;
		f = new father();
		f.salary();
		
		f = new deeptha();
		f.salary();
		f = new ram();
		f.salary();
	}

}
class father{
	 void salary() {
		System.out.println("father"+20);
	}
}
class deeptha extends father{
	
	void salary() {
		System.out.println("deeptha"+10);
	}
}

class ram extends father{
	void salary() {
		System.out.println("ram"+5);
	}
}
