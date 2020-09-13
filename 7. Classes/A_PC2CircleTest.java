import java.util.Scanner;
import java.text.DecimalFormat;

public class A_PC2CircleTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		double radius, area, circumference;
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			// Create A_PC2Circle object 
			A_PC2Circle myCircle = new A_PC2Circle();
			
			// Input radius
			radius = sc.nextDouble();
			myCircle.setRadius(radius); // set radius
			
			// Return area
			area = myCircle.getArea();
			
			// Return circumference
			circumference = myCircle.getCircumference();
			
			System.out.println("Case #" +i+ ": " 
					+ df.format(myCircle.getRadius()) + " "
					+ df.format(myCircle.getArea()) + " "
					+ df.format(myCircle.getCircumference()));
			
		}
			
	}

}
