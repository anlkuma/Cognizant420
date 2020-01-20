interface Fly{
	int speed=100;
	void show();
}



public class Air extends Automobile implements Fly{
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void show()
	{	System.out.println("\nThe Automobile details are:\n ModelNumber: "+getModelNumber()+"\nModel Name: "+getModelName());
		System.out.println("The plane flies at "+speed+" kmph");
	}

}
