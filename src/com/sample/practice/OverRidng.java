package com.sample.practice;

public class OverRidng extends salary{
	public static void main(String[] args) {
		
	
	salary s = new salary();
	s.salary_x1(30000);
	 
	s = new deepthasalary();
	s.salary_x1(5000);
	 
	}	
}
	


	class salary {
		 void salary_x1(float n) {
	 
		System.out.println("salary x1" + "  "+n);
	}
	
	 }
	
	class deepthasalary extends salary{
		void salary_x1() {
			 
			System.out.println("salary x" + "  ");
		}
	}
		
	class hhhhsalary extends salary{
		void salary_x1() {
			 
			System.out.println("salary x1" + "  ");
		}
	}


