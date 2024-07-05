package lab4;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<MyShape, String> myHashMap = new HashMap<>();
		Circle myCircle = new Circle(0, 0, 1);
		Rectangle myRectangle = new Rectangle(0, 1, 1, 0);
		Square mySquare = new Square(0, 1, 1);
		
		myHashMap.put(myCircle, "CIRCLE");	
		myHashMap.put(myRectangle, "RECTANGLES");	
		myHashMap.put(mySquare, "SQUARES");	
		
		System.out.println("INITIAL - " + myHashMap.size() + " " + myHashMap.get(myCircle));
		
		Circle circleWithSameAttributes = new Circle(0, 0, 4);
		myHashMap.put(circleWithSameAttributes, "SAME CIRCLES");
		System.out.println("ADDED CIRCLE WITH SAME ATTRIBUTES - " + myHashMap.size() + " " + myHashMap.get(myCircle));
	}

}
