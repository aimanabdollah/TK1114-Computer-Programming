import java.util.Scanner;
public class E_ForwardBackward {  
	public static void main(String args[]){  
   
		Scanner sc = new Scanner(System.in);
  
		int r, N=1, n, temp;  
		
		do {
			int reversed = 0;
			n = sc.nextInt();
			if (n == -1)
				System.exit(0);
			// Store number as temp
			temp=n;  
			
			// Reverse number using a while loop
			while(n != 0){    
				r=n%10;  //getting remainder  
				reversed=(reversed*10)+r;    
				n = n/10;    
			} 
			
			// Compare temp and reversed
			if(temp==reversed)    
				System.out.println("Case #" +N+ ": YES");    
			else    
				System.out.println("Case #" +N+ ": NO");    
			N++;
		} while (n != -1);
		
		
		
}  
}  

/*
  
SAMPLE INPUT OUTPUT
 	    
 2
Case #1: YES
16461
Case #2: YES
353
Case #3: YES
88
Case #4: YES
30
Case #5: NO
-1

ALGORITHM

1.	Get the number to check for palindrome
2.	Hold the number in temporary variable
3.	Reverse the number
4.	Compare the temporary number with reversed number
5.	If both numbers are same, print "palindrome number"
6.	Else print "not palindrome number"

https://www.programiz.com/java-programming/examples/reverse-number

*/
