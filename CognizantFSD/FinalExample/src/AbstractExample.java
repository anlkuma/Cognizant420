abstract class AbstractClass{
	abstract void add(int a, int b);
	void show()
	{
		System.out.println("inside abstract class, non abstract method");
	}
}
class AbstractImplement extends AbstractClass{

	void add(int a, int b) {
		System.out.println(a+b);
	}
	
}





public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImplement a = new AbstractImplement();
		a.show();
		a.add(10, 20);
		;
	}

}
