import java.util.*;


class Box{
			int len, wid, hi;
	
		public int CalVol(int l, int w, int h)
	{			
		return len*wid*hi;
	
	
	
	}
		
		public void setdata(int l, int w, int h)
		{ 
			 len = l;
			wid= w;
			hi = h;
		}	
		public void getdata()
			{
				System.out.println("The dimensions of the box:\nLength: "+len+"\nWidth: "+wid+"\nHeight: "+hi);
			}

		public static void main(String args[])
		{
			Scanner s= new Scanner(System.in);
			 int l = s.nextInt();
			int w = s.nextInt();
			int h = s.nextInt();
			Box b = new Box();
				b.setdata(l,w,h);
				b.getdata();
			System.out.println("the volume of the box is: "+b.CalVol(l,w,h));
				

		}

}	