class A
{
	static	 int count=0;
	 int st = 100;
		A()
		{
			count++;
		}
	
	public static void main(String args[])
	{	

		int abcd = 69;
		A a = new A();
		A b = new A();
		System.out.println(a.st);
		System.out.println(count);
		System.out.println(abcd);
			
	}

}