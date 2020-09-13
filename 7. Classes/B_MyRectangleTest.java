import java.util.Scanner;
import java.text.DecimalFormat;

public class B_MyRectangleTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double width, height, area, perimeter;
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			// Create A_PC2Circle object 
			B_MyRectangle myRectangle = new B_MyRectangle();
			
			// Input width
			width = sc.nextDouble();
			myRectangle.setWidth(width); // set width
			
			// Input height
			height = sc.nextDouble();
			myRectangle.setHeight(height); // set height
			
			// Return area
			area = myRectangle.getArea();
			
			// Return perimeter
			perimeter = myRectangle.getPerimeter();
		
			System.out.println("Case #" +i+ ": " 
					+ df.format(width) + " "
					+ df.format(height) + " "
					+ df.format(area) + " "
					+ df.format(perimeter));
			
		}
			
	}

}
