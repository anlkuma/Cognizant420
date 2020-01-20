
public class Rectangle extends Shape {

	int length, width;

	public Rectangle(int shapeID, String shapeName, int length, int width) {
		super(shapeID, shapeName);
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public void rectangleArea() {
		System.out.println(length*width);
	}
	/*@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", shapeID=" + shapeID + ", shapeName=" + shapeName
				+ ", getLength()=" + getLength() + ", getWidth()=" + getWidth() + ", getShapeID()=" + getShapeID()
				+ ", getShapeName()=" + getShapeName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}*/

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", shapeID=" + shapeID + ", shapeName=" + shapeName
				+ "]";
	}
	
	

}
