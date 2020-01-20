
public class Square extends Shape {
	int side;

	public Square(int shapeID, String shapeName, int side) {
		super(shapeID, shapeName);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	public void areaOfSquare()
	{
		System.out.println(side*side);
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", shapeID=" + shapeID + ", shapeName=" + shapeName + ", getSide()=" + getSide()
				+ ", getShapeID()=" + getShapeID() + ", getShapeName()=" + getShapeName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
