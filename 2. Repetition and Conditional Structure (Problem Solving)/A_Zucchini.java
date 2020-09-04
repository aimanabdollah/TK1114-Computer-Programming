import java.util.Scanner;
import java.text.DecimalFormat;
public class A_Zucchini {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int N;
		
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			int option, quantity;
			double total;
			
			option = sc.nextInt();
			quantity = sc.nextInt();
			
			if(option == 1)
				total = 7.50 * quantity;
			else if(option == 2)
				total = 6.99 * quantity;
			else if(option == 3)
				total = 4.70 * quantity;
			else if(option == 4)
				total = 5.30 * quantity;
			else if(option == 5)
				total = 5.99 * quantity;
			else
				break;
			
			System.out.println("Case #" +i+ ": RM" +df.format(total));
		
			}
		}
	}


