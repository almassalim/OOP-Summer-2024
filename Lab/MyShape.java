package lab4;

public class MyShape {
	String color;
	boolean filled;
	
	//Constructors--------------------------------
	public MyShape() {
		this.color = "red";
		this.filled = true;
	}
	public MyShape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	//--------------------------------------------
	
	//Getters-----------------
	public String getColor() {
		return color;
	}
	public boolean IsFilled() {
		return filled;
	}
	//-------------------------
	
	//Setters----------------------------
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	//-------------------------------------
	
	//Methods----------------------------------
	public double getArea() {
		return 0;
	}
	
	public double getCircumference() {
		return 0;
	}
	
	public String toString() {
		return "MyShape{" + 
				"color=" + color + 
				", isFilled=" + filled +
				'}';
	}
	//+++++++++++++++++++++++++++++++++++++++++++
	
	public boolean equals(Object obj)
	{
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		MyShape myShape = (MyShape) obj;
		return color.equals(myShape.getColor()) &&
				filled == myShape.IsFilled();
	}
	
	public int hashCode() {
		int result = 17;
		if(color != null) {
			result = 31 * result + color.hashCode();
		}
		if(filled) {
			result = 37 * result;
		}
		
		return result;
	}
}
