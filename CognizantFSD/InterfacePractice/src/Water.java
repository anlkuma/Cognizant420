interface Float{
	int speed = 22;
	void show();
}
public class Water extends Automobile implements Float {
		
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
	
	@Override
	public void show() {
		System.out.println("\nThe Automobile details are:\n ModelNumber: "+getModelNumber()+"\nModel Name: "+getModelName());
		System.out.println("The ship sails at "+speed+"kmph");
	}

}

