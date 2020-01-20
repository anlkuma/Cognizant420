
public class Shape {
		int shapeID;
		String shapeName;
		public Shape(int shapeID, String shapeName) {
			super();
			this.shapeID = shapeID;
			this.shapeName = shapeName;
		}
		public int getShapeID() {
			return shapeID;
		}
		public void setShapeID(int shapeID) {
			this.shapeID = shapeID;
		}
		public String getShapeName() {
			return shapeName;
		}
		public void setShapeName(String shapeName) {
			this.shapeName = shapeName;
		}
		public void displayShape() {
			System.out.println("Name of the shape: "+shapeName+"ID of the shape: "+shapeID);
		}

}
