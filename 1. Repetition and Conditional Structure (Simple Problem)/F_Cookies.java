import java.util.Scanner;
public class F_Cookies {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int testCase = sc.nextInt();
	
		for(int i = 1; i <= testCase; i++) {
			
			final int cookiesPerBox = 24;
			final int boxPerContainer = 75;
			final int cookiesPerContainer = 1800;
			
			int cookies = sc.nextInt();
			int cookiesInBox = sc.nextInt();
			int boxInContainer = sc.nextInt();
			
			int totalCookies = (boxInContainer * cookiesPerBox) + cookiesInBox + cookies;
			
			int numContainers, remainingCookies, numBoxes;
			numContainers = totalCookies / cookiesPerContainer;
			remainingCookies = totalCookies % cookiesPerContainer;
			
			numBoxes = remainingCookies / cookiesPerBox;
			remainingCookies = remainingCookies % cookiesPerBox;
			
			System.out.println("Case #" +i+ ": "+numContainers+ " " +numBoxes+ " " +remainingCookies);
		
		}
	}
}
		
	
		
