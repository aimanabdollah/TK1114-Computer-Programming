import java.util.Scanner;
import java.util.Arrays;
public class E_InnerProduct
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int j=0; j<testCase; j++) {
			
			int product=0, sum=0;
			
			int size =sc.nextInt();
			int[] arrA = new int[size];
			int[] arrB = new int[size];
			
			for(int i=0; i<size; i++) {	
				arrA[i] = sc.nextInt();
			}
			
			for(int i=0; i<size; i++) {	
				arrB[i] = sc.nextInt();
			}
			
			for (int i = 0; i < size; i++) {  
			  product = arrA[i] * arrB[i]; 
			  sum = sum + product; 
			}

			
			System.out.println("Case #"+(j+1)+": "+sum);
		}
	
	}
}


