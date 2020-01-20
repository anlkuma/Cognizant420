class yo
{
	static int count = 1;
	yo()
	{count++;}
	public static void main(String args[])
	{
	yo y = new yo();
	yo y1 = new yo();
	yo y2 = new yo();
	System.out.println(y1.count);
	}
}