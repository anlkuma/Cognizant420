
public class ExceptionExample {
	public static void main(String args[]) {
		int a=5, b=0;
		try {
		System.out.println(a/b);
		throw new ArithmeticException();
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("HarBalaji Singh");
		
	}
	
}
