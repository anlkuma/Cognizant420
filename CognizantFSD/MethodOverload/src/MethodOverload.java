
 class Addition{
	 int add(int a, int b) {
		 return a+b;
	 }
	 double add(double a, double b) {
		 return a+b;
	 }
	 double add(double a, int b) {
		 return a+b;
	 }
	 
 }




 public class MethodOverload {
	public static void main(String args[]) {
		
		Addition a = new Addition();
		System.out.println(a.add(10, 15));
		System.out.println(a.add(10.5, 15.1005));
		System.out.println(a.add(10, 2.3));
		
	}
}
