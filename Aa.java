class Aa{
	Aa()
	{
		System.out.println("Aa()");

	}
	Aa(int  a)
	{
		this();
		System.out.println(a);
	}
	Aa(int a, int b)
	{
		this(a);
		System.out.println(b);
	}
	public static void main(String ar[]){
	Aa a = new Aa(2,56);}
}
	