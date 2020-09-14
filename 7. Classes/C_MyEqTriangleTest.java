import java.util.Scanner;
import java.text.DecimalFormat;

class C_MyEqTriangleTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		double side, area, perimeter;
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			// Create C_MyEqTriangle object 
			C_MyEqTriangle myEqTriangle = new C_MyEqTriangle();
			
			// Input side
			side = sc.nextDouble();
			myEqTriangle.setSide(side); // set side
	
			// Return area
			area = myEqTriangle.getArea();
			
			// Return perimeter
			perimeter = myEqTriangle.getPerimeter();
		
			System.out.println("Case #" +i+ ": " 
					+ df.format(side) + " "
					+ df.format(area) + " "
					+ df.format(perimeter));
			
		}
			
	}

}
