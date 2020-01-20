class StaticBlock{

	static int a;
	
	 static void setA(int a)
	{
		//a=56;
		System.out.println("Static method is called, a:"+a);

	}
	 static
		{
			a = 10;
			System.out.println("Static Block is called, a: "+a);
	
		}
	public static void main(String ar[])
	{	System.out.println("check");
		setA(120);
	}

}