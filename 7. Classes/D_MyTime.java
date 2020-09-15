
public class D_MyTime {
	
	private int hour;
	private int min;
	
	// A no-arg constructor that creates a default rectangle
	// A default value for hour and minute is 0
	D_MyTime() {
		hour = 0;
		min = 0;
	}
	
	// setSide(double) method to set a new side value
	void setSide(double newSide) {
		side = newSide;
	}
	
		
	// getWidth() method that returns the side
	double getSide() {
		return side;
	}
	
	// getArea() method that returns the area of the eqTriangle
	double getArea() {
		return 0.5 * side * side;
	}
	
	// getPerimeter() method that returns the perimeter of the eqTriangle
	double getPerimeter() {
		return side * 3;
	}
}
	

