
public class Circle extends Shape {
		int radius;

		public Circle(int shapeID, String shapeName, int radius) {
			super(shapeID, shapeName);
			this.radius = radius;
		}

		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}

		public void circleArea()
		{
			System.out.println(radius*radius*3.14);
		}

		@Override
		public String toString() {
			return "Circle [radius=" + radius + ", shapeID=" + shapeID + ", shapeName=" + shapeName + ", getRadius()="
					+ getRadius() + ", getShapeID()=" + getShapeID() + ", getShapeName()=" + getShapeName()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		
		

}
