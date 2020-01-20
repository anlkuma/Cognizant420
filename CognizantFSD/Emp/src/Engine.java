
public class Engine {
	int engineNumber, age;
	String fuelType;
	
	
	
	
	public Engine(int engineNumber, int age, String fuelType) {
		super();
		this.engineNumber = engineNumber;
		this.age = age;
		this.fuelType = fuelType;
	}
	
	
	public int getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", age=" + age + ", fuelType=" + fuelType
				+ ", getEngineNumber()=" + getEngineNumber() + ", getAge()=" + getAge() + ", getFuelType()="
				+ getFuelType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}



class Car{
	int carNumber;
	String carModel;
	Engine e;
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carModel=" + carModel + ", e=" + e + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Car(int carNumber, String carModel, Engine e) {
		super();
		this.carNumber = carNumber;
		this.carModel = carModel;
		this.e = e;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	
}	


	

