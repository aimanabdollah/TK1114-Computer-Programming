// write program that count how many num are divisible by 4
// ends with the input -1
import java.util.Scanner;
public class H_RightTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int test;
		int a, b, c;	
		
		// System.out.print("How many test case you want? ");
		test = sc.nextInt();
	
		for(int i = 1; i<=test; i++) {
		
			// System.out.println("Enter 3 sides value of triangle: ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if ((a*a) + (b*b) == (c*c))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}			
		}
	}
}