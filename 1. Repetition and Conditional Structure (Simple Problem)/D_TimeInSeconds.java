// write program to convert time to hour minute and scond
import java.util.Scanner;
public class D_TimeInSeconds {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int test;
		int sec;
		int min;
		int hour;
		
		// System.out.print("How many test case you want? ");
		test = sc.nextInt();
	
		for(int i = 1; i<=test; i++) {

			// System.out.print("Enter your time in second: ");
			sec = sc.nextInt();
			
			hour = sec / 3600;
			sec = sec % 3600;
			min = sec / 60;
			sec = sec % 60;
			
			System.out.println("Case #" +i+ ": " + hour + ":" + min + ":" + sec);
		}
	}

}

