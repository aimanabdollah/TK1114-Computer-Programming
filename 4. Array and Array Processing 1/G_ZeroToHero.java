import java.util.Arrays;
import java.util.Scanner;
public class G_ZeroToHero {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=1; i<=testCase; i++) {
			
			int size = sc.nextInt();
			
			int[] num =new int[size];
			
			for(int j=0; j<num.length; j++) {
				num[j] = sc.nextInt();
			}
			
			int max = num[0];
			
			for(int j=0; j<num.length; j++) {
				if(num[j]>max)
					max = num[j];
			}
			

			for(int j=0; j<num.length; j++) {
				if(max % 2 != 0) {
						if(num[j] == 0) {
								num[j] = max;
						}
				}
			}
			
			System.out.println("Case #"+i+": "+Arrays.toString(num));
		}
	}
}
			
	
		
	
