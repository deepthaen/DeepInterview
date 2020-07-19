package com.sample.arruus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arrays_1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Arrays
//		for (int i = 0; i <=2; i++) {
//			a[i]=String.valueOf(i);
//			System.out.println(a[i]);		}
		
		//Array list
		
//		al.add(1);
//		al.add(100);
//		al.remove(0);
//		System.out.println(al);
//		Thread.sleep(1000);
		ArrayList<Integer> a = new ArrayList<Integer>();
		String c ="d";
		System.out.println(String.valueOf(c.charAt(3)));
		
		
	}
	public static String b ;
	
	
	
	public static String getB() {
		return b;
	}

	public static void setB(String b) {
		Arrays_1.b = b;
	}
	/**
	 * Arrays
	 * Array list
	 * List
	 * 
	 */
	//Arrays -- here we are giving fixed size of number
	static String[] a = new String[30];//0,1
	int[] ia=  new int[100];
	
	
	//Array List -- is a class
	// Array is not fixed
	//Its has predefined method for array list
	//Array list is implemeted based on List (Interface)
	//On run time we can keep adding data
	//It s a dynamic 
	static ArrayList<Integer> al = new ArrayList<>();
	
	//List
	static List<Integer> l = new ArrayList<>();
	
	
	
	

}
