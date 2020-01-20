
public class Varargsadd {
	
	
	static void display(int... a) {
		int total=0;
		for(int x:a) {
			total = total + x;
		}
		System.out.println(total);
	}
	 
	 public static void main(String args[]) {
		 
		display(10,20,30);
		display(13,2);
	 }
}
