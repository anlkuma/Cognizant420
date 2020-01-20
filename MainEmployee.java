class MainEmployee
{		public static void main(String args[])
	{
		Employee e = new Employee();
		e.getEmployeeDetails();
		e.setEmployeeDetails(8449, 21900, "Anil Kumar");
		e.calculateSalary();
		e.getEmployeeDetails();
		Employee e1 = new Employee(21, 9329, "Uday");
		e1.getEmployeeDetails();
	}
}