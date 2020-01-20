class Student{

	int id,fees;
	String name, branch;
	public void getdetails()
	{

		System.out.println("\n\n\nID: "+id+"\nName: "+name+"\nBranch: "+branch+"\nFees: "+fees+"\n\n\n");

	}
	public void setdetails(int id, String name, String branch, int fees)
	{		
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.fees = fees;
		

		
	}

		public static void main(String a[])
			{
				Student s = new Student();
				s.setdetails(69, "Anil", "JAVA FSD", 696969);
				s.getdetails();

			}
}