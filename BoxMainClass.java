class BoxMainClass{
	public static void main(String args[])
	{
		Box1 b1 = new Box1();
		b1.calculateVolume();
		b1.getBoxDetails();
		Box1 b2 = new Box1(10,20,30);
		b2.calculateVolume();
		b2.getBoxDetails();
		b2.setBoxDetails(10,10,10);
		b2.calculateVolume();
		b2.getBoxDetails();
	}


}