// write program that count how many num are divisible by 4
// ends with the input -1
import java.util.Scanner;
public class C_Fantastic4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int num;
		int count = 0;
	
		// System.out.println("Enter any number positive number and ends the program with -1");
		num = sc.nextInt();
		while(num!=-1) {
			if (num%4 == 0){
				count++;
			}
			num = sc.nextInt();	
		}
		
		System.out.print(count);
	}

}
