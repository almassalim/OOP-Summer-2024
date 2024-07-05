package lab4;

public class Square extends Rectangle {
	//Constructors-----------------------------------------------------------------------------------------------
	public Square() {
		super();
	}
	public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength) {
		super.xTopLeftCoordinate = xTopLeftCoordinate;
		super.yTopLeftCoordinate = yTopLeftCoordinate;
		super.xBottomRightCoordinate = xTopLeftCoordinate + sideLength;
		super.yBottomRightCoordinate = yTopLeftCoordinate - sideLength;
	}
	public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength, String color, boolean filled) {
		super.xTopLeftCoordinate = xTopLeftCoordinate;
		super.yTopLeftCoordinate = yTopLeftCoordinate;
		super.xBottomRightCoordinate = xTopLeftCoordinate + sideLength;
		super.yBottomRightCoordinate = yTopLeftCoordinate - sideLength;
		super.color = color;
		super.filled = filled;
	}
	//------------------------------------------------------------------------------------------------------------
	
	//Methods-------------------------
	public int getSideLength() {
		return super.getLength();
	}
	public double getArea() {
		return Math.pow(getSideLength(), 2);
	}
	public double getCircumference() {
		return 4 * getSideLength();
	}
	
	public String toString() {
		return "A square with side= " + getLength() + ", which is a subclass of " + super.toString();
	}
	//++++++++++++++++++++++++++++++++++++++++++++
	
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public int hashCode() {
		int result = super.hashCode();
		return result;
	}
}
