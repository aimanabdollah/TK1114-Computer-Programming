// write program that convert RM to Won
// RM 1 = 278.82 Won
import java.text.DecimalFormat;
import java.util.Scanner;
public class B_HowManyWon {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		
		int test;
		double inputRM;
		double outputWon;
		
		// System.out.print("How many test case you want? ");
		test = sc.nextInt();
	
		for(int i = 1; i<=test; i++) {
			
			// System.out.print("Enter your input: RM ");
			inputRM = sc.nextDouble();
			outputWon = inputRM * 278.82;
			System.out.println("Case #" + i + ": " + df.format(outputWon));
			}	
	
	}

}
