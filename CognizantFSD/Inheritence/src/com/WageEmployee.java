package com;

public class WageEmployee extends Employee{
	int num, hours;
	
	
	
public WageEmployee(int empId, int empSalary, String empName, String empLocation, int num, int hours) {
		super(empId, empSalary, empName, empLocation);
		this.num = num;
		this.hours = hours;
	}

/*	public WageEmployee(int empId, int empSalary, String empName, String empLocation) {
		super(empId, empSalary, empName, empLocation);
		
		
		// TODO Auto-generated constructor stub
	}
*/
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	public int calculateSalary(int salary) {
		return salary*hours*num;
	}

	@Override
	public String toString() {
		return "WageEmployee [num=" + num + ", hours=" + hours + ", empId=" + empId + ", empSalary=" + empSalary
				+ ", empName=" + empName + ", empLocation=" + empLocation + ", getNum()=" + getNum() + ", getHours()="
				+ getHours() + ", getEmpId()=" + getEmpId() + ", getEmpSalary()=" + getEmpSalary() + ", getEmpName()="
				+ getEmpName() + ", getEmpLocation()=" + getEmpLocation() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	/*@Override
	public String toString() {
		return "WageEmployee [num=" + num + ", hours=" + hours + ", empId=" + empId + ", empSalary=" + empSalary
				+ ", empName=" + empName + ", empLocation=" + empLocation + ", getNum()=" + getNum() + ", getHours()="
				+ getHours() + ", getEmpId()=" + getEmpId() + ", getEmpSalary()=" + getEmpSalary() + ", getEmpName()="
				+ getEmpName() + ", getEmpLocation()=" + getEmpLocation() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}*/
	
	
	

	
	
   
}
