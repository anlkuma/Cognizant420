package manman;

class Floor{
	
	//float a = 101.34;
	public static void main (String args[]) {
		
		 int min = 45, max = 50;
		 int range = max-min + 1;
		 double abc = 0;
		 for(int i = 1; i<=10;i++) {
		 abc =    Math.random()*range + min;
		
		System.out.println((int)Math.floor(abc)+" "+(int)Math.ceil(abc));
		 }
		
	}
}

