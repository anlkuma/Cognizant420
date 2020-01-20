package com;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass6969 {
	public static void main(String args[]) {

	ArrayList<MainClass69> a2 = new ArrayList<MainClass69>();
	a2.add(new MainClass69(001, 2000, "Cnil"));
	a2.add(new MainClass69(002, 3000, "Anil"));
	a2.add(new MainClass69(003, 4000, "Bnil"));
	
	Collections.sort(a2,new MainClass69(0,0,"drr"));
	
	System.out.println("\n\nSorting by name:");
	for(MainClass69 ee:a2)
		System.out.println(ee.employeeID+" "+ee.employeeName+" "+ee.employeeSalary);
	
	Collections.sort(a2, new IDCompare());
	//Iterator it = a2.iterator();
	//while(it.hasNext()) {		
		
		//Employee1 ee = (Employee1)it.next();
	
	System.out.println("\nSorting by ID: ");
	
	for(MainClass69 ee:a2)
		System.out.println(ee.employeeID+" "+ee.employeeName+" "+ee.employeeSalary);
	
	}
	

}
