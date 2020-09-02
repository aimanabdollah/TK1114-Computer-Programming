import java.util.Scanner;
public class E_FlooringTiles {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int test;
		double width, length, tile;
		
		// System.out.print("How many test case you want? ");
		test = sc.nextInt();
	
		for(int i = 1; i<=test; i++) {

			// System.out.print("Enter the width in cm: ");
			width = sc.nextDouble();
			// System.out.print("Enter the length in cm: ");
			length = sc.nextDouble();
			
			tile = Math.ceil(width/30)*Math.ceil(length/30);
			
		
			System.out.println("Case #" + i + ": " + (int)tile);
		}
	}

}

