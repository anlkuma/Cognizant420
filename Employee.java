class Employee
{
	int empID, salary;
	String empName;		

		public Employee()
		{
			empID = 200;
			empName = "Balaji";
			salary = 239293;
		}	
		public Employee(int empID, int salary, String empName)
		{
			this.empID = empID;
			this.salary = salary;
			this.empName = empName;

		}
		void setEmployeeDetails(int empID1, int salary1, String empName1)
		{
			empID = empID1;
			salary = salary1;
			empName = empName1;
		}
		void getEmployeeDetails()
			{
				System.out.println("\nEmployeeID: "+empID+" z\nEmployeeName: "+empName+"\nSalary: "+calculateSalary());
			}

		int calculateSalary()
			{
				return salary+500;
			}

}

