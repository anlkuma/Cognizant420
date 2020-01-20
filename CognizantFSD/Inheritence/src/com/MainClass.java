package com;

public class MainClass {
	public static void main(String args[]) {
		WageEmployee e = new WageEmployee(101,1000, "Anil","Chennai",4,24);
		//e.calculateSalary(200);
		System.out.println(e);
		System.out.println(e.calculateSalary(200));
		
		
	}
	

}
