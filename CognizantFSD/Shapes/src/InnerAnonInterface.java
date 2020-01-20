interface eatable {
	void eat();

}

public class InnerAnonInterface {

	public static void main(String[] args) {
		eatable e = new eatable() 
		{
			public void eat() 
			{
				System.out.println("eating..");
			}
	};
		e.eat();
		
	}
}