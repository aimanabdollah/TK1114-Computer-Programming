import java.util.Scanner;
public class B_BirthdayGraph {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int testCase = sc.nextInt();
		
		int countCase = 0;

		do {
			
			countCase++;
		
			int[] arrDays = new int[testCase];
			String[] arrMonths = new String[testCase];
			int[] arrYears = new int[testCase];
			
			for(int i=0; i<testCase; i++) {
				
				arrDays[i] = sc.nextInt();
				arrMonths[i] = sc.next();
				arrYears[i] = sc.nextInt();	
			}
			
			System.out.print("Case #"+(countCase)+": ");
			
			System.out.print("\nJan : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("01"))
					System.out.print("*");
			}
			System.out.println();
			
			System.out.print("Feb : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("02"))
					System.out.print("*");
			}
			System.out.println();
				
			System.out.print("Mar : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("03"))
					System.out.print("*");
			}
			System.out.println();
				
			System.out.print("Apr : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("04"))
					System.out.print("*");
			}
			System.out.println();
				
			System.out.print("May : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("05"))
					System.out.print("*");
			}
			System.out.println();
				
			System.out.print("Jun : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("06"))
					System.out.print("*");
				}
			System.out.println();
				
			System.out.print("Jul : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("07"))
					System.out.print("*");
			}
			System.out.println();
				
			System.out.print("Aug : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("08"))
					System.out.print("*");
			}
			System.out.println();
				
			System.out.print("Sep : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("09"))
					System.out.print("*");
			}
			System.out.println();

			System.out.print("Oct : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("10"))
					System.out.print("*");
			}
			System.out.println();
				
			System.out.print("Nov : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("11"))
					System.out.print("*");
			}
			System.out.println();
				
			System.out.print("Dec : ");
			for(int j=0; j<arrMonths.length; j++) {
				if(arrMonths[j].equals("12"))
					System.out.print("*");
			}
			System.out.println();
			

			testCase = sc.nextInt();
		}while(testCase!=0);
		
		
	}
		
}
