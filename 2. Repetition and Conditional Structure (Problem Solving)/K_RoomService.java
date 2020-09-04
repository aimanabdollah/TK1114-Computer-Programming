import java.util.Scanner;
import java.text.DecimalFormat;
public class K_RoomService {
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
				total = 2.50 * quantity;
			else if(option == 2)
				total = 2.00 * quantity;
			else if(option == 3)
				total = 2.80 * quantity;
			else if(option == 4)
				total = 3.20 * quantity;
			else if(option == 5)
				total = 3.00 * quantity;
			else
				break;
			
			System.out.println("Case #" +i+ ": RM" +df.format(total));
		
			}
		}
	}


