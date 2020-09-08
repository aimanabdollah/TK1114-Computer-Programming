import java.util.Scanner;
public class C_ReloadAirtime {
	public static void main(String[] args) {
		
		// Create scanner
		Scanner sc = new Scanner(System.in);
		
		String numReload = sc.nextLine(); // Input plain text message
		int countCase = 0;
		
		do {
			String validation = "";
			countCase++;
			
			if (numReload.length() < 14) {
				validation = "invalid";		
			}
			else {
				if (numReload.contains("*122*")) {
					if(numReload.charAt(13) == '#') {
						validation = "valid";
					}
					else
						validation = "invalid";	
				}
				else
					validation = "invalid";
					
			}
			
			System.out.println("Case #" + countCase + ": " + validation);
			numReload = sc.nextLine();
			
		} while(!numReload.equals("*"));
	}
}
		
		
			
			
				
			
			