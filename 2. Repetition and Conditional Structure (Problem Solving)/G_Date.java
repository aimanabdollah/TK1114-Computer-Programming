import java.util.Scanner;
public class G_Date {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			int d, m, y;
			String MMM = null;
			
			d = sc.nextInt();
			m = sc.nextInt();
			y = sc.nextInt();
			
			if (m == 1)
				MMM = "January";
			else if (m == 2)
				MMM = "February";
			else if (m == 3)
				MMM = "March";
			else if (m == 4)
				MMM = "April";
			else if (m == 5)
				MMM = "May";
			else if (m == 6)
				MMM = "June";
			else if (m == 7)
				MMM = "July";
			else if (m == 8)
				MMM = "August";
			else if (m == 9)
				MMM = "September";
			else if (m == 10)
				MMM = "October";
			else if (m == 11)
				MMM = "November";
			else if (m == 12)
				MMM = "December";
			else
				System.exit(0);
			
			System.out.println(d+" " +MMM+ " "+y);		
		
			}
		}
	}
