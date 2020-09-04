import java.util.Scanner;
public class H_ISBNcheckDigit {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	// System.out.print("Enter number of test cases: ");
	int testCase = sc.nextInt();
	
	for( int i = 1; i<=testCase; i++ ) {
		
		// System.out.print("Enter 9 first digit of ISBN-10: ");
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		int d4 = sc.nextInt();
		int d5 = sc.nextInt();
		int d6 = sc.nextInt();
		int d7 = sc.nextInt();
		int d8 = sc.nextInt();
		int d9 = sc.nextInt();
		
		int y = 10 * d1 + 9 * d2 + 8 * d3 + 7 * d4 + 6 * d5 + 5 * d6 + 4 * d7 + 3 * d8 + 
				2 * d9;
					
		// Compute last digit
		int d10 = ( 11 - y % 11 ) % 11;
		
		System.out.println("Case #" + i + ": " + d10);
	
	}
  }
}
/*
SAMPLE INPUT OUTPUT

3
0 3 0 6 4 0 6 1 5
9 8 3 5 9 3 8 1 8
8 9 0 4 5 3 1 4 1
Case #1: 2
Case #2: 0
Case #3: 1

*/