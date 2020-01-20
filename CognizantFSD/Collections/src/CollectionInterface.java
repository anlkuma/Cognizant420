import java.util.*;
public class CollectionInterface {

	public static void main(String[] args) {
		ArrayList<String> e = new ArrayList<String>();
		e.add("hello");
		e.add("world");
		e.add("man");
		System.out.println(e);
		ArrayList<String> e1 = new ArrayList<String>();
		e1.add("drr");
		e1.add("dfjdkfj");
		e1.add("uday");
		e.addAll(e1);
		System.out.println(e);
		e.removeAll(e1);
		System.out.println(e);
		e.remove("world");
		System.out.println(e);
	}

}

