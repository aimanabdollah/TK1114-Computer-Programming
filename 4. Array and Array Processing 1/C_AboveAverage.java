import java.util.Scanner;
public class C_AboveAverage {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int testCase = sc.nextInt();

		for(int j=1; j<=testCase; j++) {
			
			int count = 0, sum = 0;
			int avg=0, percentage = 0;
			
			int[] marks = new int[100];
			int i=0;
			marks[i]=sc.nextInt();
				while(marks[i]!=-1)
				{
					sum=sum+marks[i];
					count=count+1;
					i++;
					marks[i]=sc.nextInt();			
				}
			
				
			avg = Math.round(sum/count);
			System.out.println(count);
			System.out.println(sum);
			System.out.println(avg);
			
			int aboveAvg = 0;
				
			for(int a=0; a<count; a++)//LOOP UNTUK CARI NUM ABOVE AVERAGE
			{
				if(marks[a]>avg)
				{
					aboveAvg++;
				}
			}
			System.out.println(aboveAvg);	
			
			percentage= Math.round((aboveAvg%count)*10);
			
			System.out.println(percentage);
				
				
			System.out.println("Case #" + (j) + ": " + avg + " " + percentage+ "%");
					
					
		}
	
	
	}
		
}
