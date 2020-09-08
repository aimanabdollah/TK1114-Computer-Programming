import java.util.Scanner;
public class A_ValidPassword {
	public static void main(String[] args) {
		
		// Create scanner
		Scanner sc = new Scanner(System.in);
		
		// Enter the password
		String password = sc.nextLine();
		
		/* Initialize the variable used : number of count case 
		                                : number of password that not contain digit or letters
		 */ 
		int countCase = 0;
		int count;
		
		do {
			// Increment the number of count case
			countCase++;
			
			// Check that password, must have at least 6 characters as first rule
			// if less than 6, print invalid	
			// Go to input statement to enter password again 
			if (password.length() < 6 ) {
				System.out.println("Case #" +countCase+ ": invalid");	
			}
			// if greater than 6,
			// check for the next rule	
			else {
				count = 0;
				// Loop to check each character in password
				for (int i = 0; i < password.length(); i++) {
					// If character in password contains letter from 'a' || 'z' || digits
					// continue with loop again with the other character
					if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
							|| Character.isDigit(password.charAt(i))) {
						continue; // Go to for statement
					}
					// If found that character in password contains otherwise, make count to 1, and end the looping
					// Go to print invalid statement
					else {
						count = 1;
					}
				}
				if (count != 1)
					System.out.println("Case #" +countCase+ ": valid");	
				else
					System.out.println("Case #" +countCase+ ": invalid");			
			}

			// Enter the password again and end the do-while loop by entering #
			password = sc.nextLine();
				
		} while (!password.equals("#"));
	}

}
