class Box{
	
		public int CalVol(int l, int w, int h)
	{			
		return l*w*h;
	
	
	
	}
		
		public void setdata(int l, int w, int h)
		{
			this.l = l;
			this.w= w;
			this.h = h;
		}	
		public getdata()
			{
				System.out.println("The dimensions of the box:\nLength: "+l+"\nWidth"+w+"\nHeight"+h);
			}

		public static void main(String args[])
		{
			Scanner s= new Scanner(System.in)
			 int l = s.nextInt();
			int w = s.nextInt();
			int h = s.nextInt();
			Box b = new Box();
				b.setdata();
				b.getdata();
			System.out.println("the volume of the box is: "+b.CalVol());
				

		}

}	