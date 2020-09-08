import java.util.Arrays;
import java.util.Scanner;
public class D_CountEachLetter {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String[] line = new String[100];
    	
    	String str = ".";
    	
    	int i = -1, j = 0;
    	
    	while (!str.equals("#")) {
    		str = sc.nextLine();
    		line[++i] = str;
    	}
    	
    	for( j = 0; j< i; j++) {
    		System.out.print("Case #" + (j+1) + ": ");
    		countChars(line[j]);
    	}
    }
    
    static void countChars(String str)
    {
        int hashIndex[] = new int[26]; //To store the count of chars..
        char ch;
        int length = str.length();      //Stores the length of passed str..
        //Counting the each letters..
        for (int i = 0; i < length; i++) { //Loop to traverse the string..
            ch = str.charAt(i);             //Fetch a single char from str..
            if((ch >= 'A' && ch <= 'Z'))  
                hashIndex[str.charAt(i)-65]++; //Adding to the hashIndex..
            else if((ch >= 'a' && ch <= 'z'))
                hashIndex[str.charAt(i)-97]++;
        }
        //Note :Checks only for alphabets..
        //Eg. ASCII of c is 99 , so 99-97= 2; Increases the hashIndex[2]++.
        int a = 97;
        for (int i = 0; i < 26; i++) {
            if (hashIndex[i] != 0) {    //Denotes the count of chars..
                ch = (char)a;           //To print alphabets
                System.out.print(ch + "(" + hashIndex[i] + ") ");   //Output..     
            }
            a++;                        //Point to next alphabet..
        }
        System.out.println();
    }
    
}
    	
    	
    	
    
    

    
    	