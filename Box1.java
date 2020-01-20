class Box1
{
	int boxLength , boxWidth, boxHeight;
	public Box1()
	{
		boxLength = 5;
		boxWidth = 5;
		boxHeight = 10;

	} 
	public Box1(int boxLength, int boxWidth, int boxHeight)
	{
		this.boxLength = boxLength;
		this.boxWidth = boxWidth;
		this.boxHeight = boxHeight;
	}	
	public void setBoxDetails(int boxLength, int boxWidth, int boxHeight)
	{	
		this.boxLength = boxLength;
		this.boxWidth  = boxWidth ;
		this.boxHeight  = boxHeight ;
	}
	public void getBoxDetails()
	{
		System.out.println("\n\nThe dimensions of the box are: \nLength: "+boxLength+"\nWidth: "+boxWidth+"\nHeight: "+boxHeight);
		System.out.println("The Volume of the Box is: "+calculateVolume()+"\n\n");
	}
	public int calculateVolume()
	{
		return boxLength*boxWidth*boxHeight ;
	} 
}

