import java.util.*;

class calculate{

			public int add(int a, int b)
			{return a+b;}
			public int subtract(int a, int b)
				{return a-b;}
			public int multiply(int a, int b)
				{return a*b;}
			public int divide(int a, int b)
				{return a/b;}


		public static void main(String args[])
			{	
				calculate c = new calculate();
				System.out.println(" enter any two numbers\n");
				
				Scanner s = new Scanner(System.in);
					int x = s.nextInt();
					int y = s.nextInt();
System.out.println("enter your choice: \nadd : a; \nsubtract: s; \nmultiply: m; \ndivide: d\n");
	
					char ch = s.next().charAt(0);
				switch (ch){
					case 'a':System.out.println(c.add(x,y)); break;
					case 's':System.out.println(c.subtract(x,y));break;
					case 'm':System.out.println(c.multiply(x,y));break;
					case 'd':System.out.println(c.divide(x,y));break;
					default: System.out.println("Invalid input");



						}








			}

}