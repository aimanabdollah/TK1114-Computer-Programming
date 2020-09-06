import java.util.Scanner;
public class A_CoconutKelapa {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int k=0; k<testCase; k++)
		{
			int days = sc.nextInt();
			int[] arrCoconut = new int[days];
			
			for(int i=0; i<days; i++) {
				arrCoconut[i] = sc.nextInt();
			}
			
			int max = arrCoconut[0], min = arrCoconut[0], countMax = 0, countMin = 0;
			
			for(int i=0; i<arrCoconut.length; i++) {
				if(max<arrCoconut[i])
					max = arrCoconut[i];
			}
			
			for(int i=0; i<arrCoconut.length; i++) {
				if(min>arrCoconut[i])
					min = arrCoconut[i];
			}
			
			for(int i=0; i<arrCoconut.length; i++) {
				if(max==arrCoconut[i])
					countMax++;
					
				else if(min==arrCoconut[i])
					countMin++;	
			}
			
			System.out.println(min + " " + countMin + " " + max + " "+ countMax);
				
			}
		}
		
}
