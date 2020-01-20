class FactRec{

		public int recfact(int n)
			{		
			
				if(n==1)
				return n;
				
				else


				
				return ( n*recfact(n-1) );



			}

		public static void main(String args[])

	{	
		FactRec f = new FactRec();	
			System.out.println(f.recfact(5));


		


	}





}