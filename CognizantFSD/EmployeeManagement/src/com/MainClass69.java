package com;
import java.util.*;

public class MainClass69 implements Comparator {
	int employeeID, employeeSalary;
	String employeeName;
	public MainClass69(int employeeID, int employeeSalary, String employeeName) {
		super();
		this.employeeID = employeeID;
		this.employeeSalary = employeeSalary;
		this.employeeName = employeeName;
	}
	
	
	public int compare(Object o1, Object o2)
	{
		MainClass69 e1 = (MainClass69)o1;
		MainClass69 e2 = (MainClass69)o2;
		return e1.employeeName.compareTo(e2.employeeName);
	}
}
  class IDCompare implements Comparator{
	  
	public int compare(Object o1, Object o2) {
		MainClass69 e1 = (MainClass69)o1;
		MainClass69 e2 = (MainClass69)o2;
		if(e1.employeeID>e2.employeeID)
			return 1;
		else if(e1.employeeID<e2.employeeID)
			return -1;
		else 
			return 0;
	}
}
	
	
	
	

