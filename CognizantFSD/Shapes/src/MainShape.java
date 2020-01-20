
public class MainShape {
	public static void main(String args[]) {
	Rectangle r = new Rectangle(1, "Rectangle",10,5);
	System.out.println(r);
	r.rectangleArea();
	Circle c = new Circle(2, "Circle", 10);
	System.out.println(c);
	c.circleArea();
	Square s = new Square(3, "Square",20);
	System.out.println(s);
	s.areaOfSquare();
	}
}
	