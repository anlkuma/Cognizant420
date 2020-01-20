class ExceptString extends Exception{
	ExceptString(String s)
	{
		super(s);
	
	}
	
}



public class CustomExceptionDemo {
	static void checkage(int age) throws ExceptString{
		if(age<18)
			throw new ExceptString("not eligible");
		else 
			System.out.println("eligible");
		
	}

	public static void main(String args[])
	{
		try 
		{
			checkage(15);
		}	
		
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);}
			System.out.println("rest of the code...");
		}
	}
