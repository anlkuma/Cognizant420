interface run {
	int speed =2000;
	void show();
}



public class Land extends Automobile implements run {
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

	
	public void show() {
		System.out.println("\nThe Automobile details are:\n ModelNumber: "+getModelNumber()+"\nModel Name: "+getModelName());
		System.out.println("The train is running at "+speed+" kmph");
		
	}
	

}
