           //UML Class Diagram                     
/**************************************************
*               PC2Circle                         *  
* ------------------------------------------------*  
* - radius: double    
* ------------------------------------------------*
* + height: double                                * 
* + PC2Circle()                                   *  
* + setRadius(radius: double) : void              *
* + getRadius(): double                           *
* + getArea(): double                             *
* + getCircumference(): double                    *
***************************************************/
public class F_BMR {
	
	private double bmr;
	
	// A no-arg constructor that creates a default circle
	// A default value for radius is 0.0
	A_PC2Circle() {
		radius = 0.0;
	}
	
	// setRadius(double) method to set a new radius value
	// setMethod is Mutator Method
	void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	// getRadius() method that returns the radius
	// getMethod is Accesor Method
	double getRadius() {
		return radius;
	}
	
	// getArea() method that returns the area of the circle
	// getMethod is Accesor Method
	double getArea() {
		return 3.1416 * radius * radius;
	}
	
	
	// getCicumference() method that returns the circumference of the circle
	// getMethod is Accesor Method
	double getCircumference() {
		return 2 * 3.1416 * radius;
	}
	
}
