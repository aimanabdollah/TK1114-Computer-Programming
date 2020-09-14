
public class C_MyEqTriangle {
	
	private double side;
	
	// A no-arg constructor that creates a default rectangle
	// A default value for side is 0.0
	C_MyEqTriangle() {
		side = 0.0;
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
	

