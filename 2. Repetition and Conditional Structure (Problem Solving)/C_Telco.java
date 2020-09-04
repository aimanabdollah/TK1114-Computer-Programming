import java.util.Scanner;
import java.text.DecimalFormat;
public class C_Telco
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
	
		double total, ftotal, totalnu=0, totaldu=0;
		int N = sc.nextInt();
	
		for(int i=0; i<N; i++)
		{
			char code=sc.next().charAt(0);
			if (code=='s' || code=='S')
			{
				double usage = sc.nextDouble();
				if(usage <= 50)
					total = 38;
				else if(usage > 50)
					total = ( 38 ) + (usage - 50 ) * 0.20;
				else
					break;
			
				System.out.println("Case #" + (i+1) + ": RM" + df.format(total));
			}
			
			else if (code=='p' || code=='P')
			{
				double dayusage = sc.nextDouble();
				if(dayusage <= 75)
					totaldu = 48;
				else if(dayusage > 75)
					totaldu = 48 + ( dayusage - 75 ) * 0.10;
				else 
					break;
				
				double nightusage = sc.nextDouble();
				if(nightusage <= 100)
					totalnu = 48;
				else if(nightusage > 100)
					totalnu = 48 + ( nightusage - 100 ) * 0.05;
			
				ftotal=totaldu+totalnu;
				System.out.println("Case #" + (i+1) + ": RM" + df.format(ftotal));
			}
		}
	}
}
	

			
			
		
	


