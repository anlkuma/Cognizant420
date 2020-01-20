

class Fact{

	public int factorial(int n)

		{	
			int fact=1;

			for(int i=1;i<=n;i++)
				{
					fact = fact*i;

				}
				//System.out.println(fact);
					return fact;
		


		}

	public static void main(String args[]){
			
			Fact f = new Fact();
			System.out.println(f.factorial(5));
	
	}

}