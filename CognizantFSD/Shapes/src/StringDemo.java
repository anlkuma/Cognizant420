
public class StringDemo {
	
	public static void main(String argsp[]) {
		
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "d";
		String s4 = "a";
		String s5 = "      fidjfdif         ";
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		
		System.out.println("_______");
		
		
		System.out.println(s1.contains("Hello"));
		System.out.println(s1.contains("man"));
		System.out.println(s1.endsWith("llo"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.replace('l', 'y'));
		System.out.println(s1.getClass());
		//System.out.println(s1.join("man", "drr"));
		//System.out.println(s1.split(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s3.compareTo(s4));
		System.out.println(s5.trim());
		//System.out.println(s1.)
	}
	
	

}
