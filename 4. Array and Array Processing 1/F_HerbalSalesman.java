import java.util.Scanner;
public class F_HerbalSalesman {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int k=0; k<testCase; k++)
		{
			int days = sc.nextInt();
			
			int[] arrProduct = new int[days];
			
			for(int i=0; i<days; i++) {
				arrProduct[i] = sc.nextInt();
			}
			
			
			int max = arrProduct[0], min = arrProduct[0], countMax = 0, countMin = 0;
			
			for(int i=0; i<arrProduct.length; i++) {
				
				if(max<arrProduct[i])
					max = arrProduct[i];

			}
			
			for(int i=0; i<arrProduct.length; i++) {
				
				if(min>arrProduct[i])
					min = arrProduct[i];
			}
			
			for(int i=0; i<arrProduct.length; i++) {
				
				if(max==arrProduct[i])
					countMax++;
					
				else if(min==arrProduct[i])
					countMin++;	
			}
			
			System.out.println("Case #"+(k+1)+": "+min + " " + countMin + " " + max + " "+ countMax);
				
			}
		}
		
}
