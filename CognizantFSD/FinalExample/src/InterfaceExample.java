interface Fly {
	int MaxSpeed = 100;

	int fly(int a);
}




class AirAutomobile implements Fly {
	public int fly(int a) {
		return a;
	}

	double speed = 100;
	String modelNo;

	void setModel(String modelNo) {
		this.modelNo = modelNo;
	}

	String show() {
		return modelNo;
	}
}



public class InterfaceExample {
	public static void main(String args[]) {
		AirAutomobile a = new AirAutomobile();
		System.out.println("the max speed of airplane is:" +a.MaxSpeed);
		System.out.println(a.fly(29));
		a.setModel("Airplane");
		System.out.println(a.show());

	}

}
