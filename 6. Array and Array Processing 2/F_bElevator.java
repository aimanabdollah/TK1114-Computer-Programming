import java.util.Scanner;
public class F_bElevator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter number of test case you want: ");
		int testCase = sc.nextInt();
		
		for(int i=1; i<=testCase; i++) {
			
			//System.out.println("Enter how many people queue: ");
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			int sum = 0, count = 0;
			
			//System.out.println("Enter size of people in pound: ");
			for(int j=0; j<size; j++) {
				arr[j] = sc.nextInt();
				sum = sum + arr[j];
				if(sum<500) {
					count++;
				}
			}
			
			System.out.println("Case #"+i+": "+count);
					
		}
		
	}

}
