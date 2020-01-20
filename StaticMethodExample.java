class StaticMethodExample
{
	
	static int num;
	
	 void setStatic(int a){
		num=a;
		System.out.println(num);
		
	}
	
	
		public static void main(String args[])
		{	//StaticMethodExample s = new StaticMethodExample();
				
			s.setStatic(10);
		}
	

}