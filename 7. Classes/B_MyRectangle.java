
public class B_MyRectangle {
	
	private double width;
	private double height;
	
	// A no-arg constructor that creates a default rectangle
	// A default value for width and height is 0.0
	B_MyRectangle() {
		width = 0.0;
		height = 0.0;
	}
	
	// setWidth(double) method to set a new width value
	void setWidth(double newWidth) {
		width = newWidth;
	}
	
	// setHeight(double) method to set a new height value
	void setHeight(double newHeight) {
		height = newHeight;
	}
		
	// getWidth() method that returns the width
	double getWidth() {
		return width;
	}
	
	// getWidth() method that returns the width
	double getHeight() {
		return height;
	}
	
	// getArea() method that returns the area of the rectangle
	double getArea() {
		return width * height;
	}
	
	// getPerimeter() method that returns the perimeter of the circle
	double getPerimeter() {
		return (width + height) * 2;
	}
	
}
