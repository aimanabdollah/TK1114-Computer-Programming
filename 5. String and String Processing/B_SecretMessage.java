import java.util.Scanner;
public class B_SecretMessage {
	public static void main(String[] args) {
		
		// Create scanner
		Scanner sc = new Scanner(System.in);
		
		String plainText = sc.nextLine(); // Input plain text message
		int shift = 1;					  // Initialize shift value to 1
		int countCase = 0;
		
		do {
			char alphabet;
			char encryptAlphabet;
			String chipherText = "";
			countCase++;
			for (int i=0; i<plainText.length(); i++) 
			{
			
				alphabet = plainText.charAt(i);
				
				// if alphabet lies between a and z with small letter
				if (alphabet >= 'a' && alphabet <= 'z') 
				{
					// if alphabet before shift is z
					if (alphabet == 'z') {
						encryptAlphabet = 'a';
					}
					else {
						encryptAlphabet = (char) ((int)alphabet + shift);
					}
				} 
				else if (alphabet >= 'A' && alphabet <= 'Z') {
					// if alphabet before shift is Z
					if (alphabet == 'Z') {
						encryptAlphabet = 'A';
					}
					else {
						encryptAlphabet = (char) ((int)alphabet + shift);
					}
				
				}
				else if (alphabet >= '0' && alphabet <= '9') {
					// if alphabet before shift is 9
					if (alphabet == '9') {
						encryptAlphabet = '0';
					}
					else {
						encryptAlphabet = (char) ((int)alphabet + shift);
					}
				
				}
				else
				{
					encryptAlphabet = alphabet;
				}
				
				chipherText = chipherText + encryptAlphabet;
				
			}
			
			System.out.println("Case #" + countCase + ": " + chipherText);
			
			plainText = sc.nextLine();
		} while (!plainText.equals("#"));		
		
	}

}

