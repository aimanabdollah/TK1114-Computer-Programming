// write program that reads 15 positive integers
// and count the numbers that are large than 10
import java.util.Scanner;
public class A_Ben10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int num;
		int count = 0;
		
		for(int i = 0; i<15; i++) {	
			num = sc.nextInt();
			if (num>10) {
				count++;
			}	
		}
		
		System.out.print(count);
	
	}

}
