package lab4;

public class Rectangle extends MyShape{
	int xTopLeftCoordinate;
	int yTopLeftCoordinate;
	int xBottomRightCoordinate;
	int yBottomRightCoordinate;
	
	//Constructors------------------------------------------------------------------------------------------------------------------------------------------
	public Rectangle() {
		super();
		this.xTopLeftCoordinate = 0;
		this.yTopLeftCoordinate = 0;
		this.xBottomRightCoordinate = 1;
		this.yBottomRightCoordinate = -1;
	}
	public Rectangle(int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate) {
		super();
		this.xTopLeftCoordinate = xTopLeftCoordinate;
		this.yTopLeftCoordinate = yTopLeftCoordinate;
		this.xBottomRightCoordinate = xBottomRightCoordinate;
		this.yBottomRightCoordinate = yBottomRightCoordinate;
	}
	public Rectangle(int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate, String color, boolean filled) {
		super(color, filled);
		this.xTopLeftCoordinate = xTopLeftCoordinate;
		this.yTopLeftCoordinate = yTopLeftCoordinate;
		this.xBottomRightCoordinate = xBottomRightCoordinate;
		this.yBottomRightCoordinate = yBottomRightCoordinate;
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Getters------------------------------
	public int getXTopLeftCoordinate() {
		return xTopLeftCoordinate;
	}
	public int getYTopLeftCoordinate() {
		return yTopLeftCoordinate;
	}
	public int getXBottomRightCoordinate() {
		return xBottomRightCoordinate;
	}
	public int getYBottomRighttCoordinate() {
		return yBottomRightCoordinate;
	}
	//---------------------------------------
	
	//Setters----------------------------------------------------------
	public void setYTopLeftCoordinate(int yTopLeftCoordinate) {
		this.yTopLeftCoordinate = yTopLeftCoordinate;
	}
	public void setXBottomRightCoordinate(int xBottomCoordinate) {
		this.xBottomRightCoordinate = xBottomRightCoordinate;
	}
	public void setYBottomRightCoordinate(int yBottomRightCoordinate) {
		this.yBottomRightCoordinate = yBottomRightCoordinate;
	}
	public void setXTopLeftCoordinate(int xTopLeftCoordinate) {
		this.xTopLeftCoordinate = xTopLeftCoordinate;
	}
	//-----------------------------------------------------------------
	
	//Methods----------------------------------------------
	public int getLength() {
		return xBottomRightCoordinate - xTopLeftCoordinate;
	}
	public int getWidth() {
		return yTopLeftCoordinate - yBottomRightCoordinate;
	}
	
	public double getArea() {
		return getLength() * getWidth();
	}
	public double getCircumference() {
		return 2 * (getLength() + getWidth());
	}
	
	public String toString() {
		return "Rectangle{" + 
		"xTopLeftCoordinate= " + xTopLeftCoordinate +
		", yTopLeftCoordinate= " + yTopLeftCoordinate +
		", xBottomRightCoordinate= " + xBottomRightCoordinate +
		", yBottomRightCoordinate= " + yBottomRightCoordinate +
		"} which is subclass of " + super.toString();
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		if (!super.equals(obj)) {
            return false;
        }
		Rectangle rectangle = (Rectangle) obj;
		return xTopLeftCoordinate == rectangle.xTopLeftCoordinate &&
				yTopLeftCoordinate == rectangle.yTopLeftCoordinate &&
				xBottomRightCoordinate == rectangle.xBottomRightCoordinate &&
				yBottomRightCoordinate == rectangle.yBottomRightCoordinate;
	}
	
	public int hashCode() {
		int result = super.hashCode();
		result = 37 * result + xTopLeftCoordinate;
		result = 37 * result + yTopLeftCoordinate;
		result = 37 * result + xBottomRightCoordinate;
		result = 37 * result + yBottomRightCoordinate;
		return result;
	}
	
}
