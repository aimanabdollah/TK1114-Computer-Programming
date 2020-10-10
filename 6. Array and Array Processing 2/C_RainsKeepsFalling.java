import java.util.Scanner;
import java.text.DecimalFormat;
public class C_RainsKeepsFalling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
        		"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        int startYear, endYear, nYear;
        int testCase = 1;
        
        startYear = sc.nextInt();
        endYear = sc.nextInt();
        
        while (startYear!=0 && endYear!=0 ) {
        	
        	// Calculate how many years will involve
        	nYear = endYear - startYear + 1;
        	
        	double rainfall[][] = new double[nYear][12];
        	
        	System.out.println("Case #" +testCase+ ":");
        	
        	for (int i=0; i<nYear; i++) {
        		for (int j=0; j<12; j++) {
        			rainfall[i][j] = sc.nextDouble();
        		}
        		double sum = 0.00;
        		int Hi = 0, Lo = 0;
        		for(int j=0; j<12; j++) {
        			sum = sum + rainfall[i][j];
        			
        			if (rainfall[i][Hi] < rainfall[i][j])
        				Hi = j;
        			if (rainfall[i][Lo] > rainfall[i][j])
        				Lo = j;
        		}
        		
        		double avg = sum / (double) 12;
        		
        		System.out.println("Year " +(startYear+i)+ ": Avg: "+df.format(avg)+
        				" Lo: "+months[Lo]+" Hi: "+months[Hi]);
        	}
        			
        	 testCase ++;
        	 startYear = sc.nextInt();
                 endYear = sc.nextInt();
        }      
    }
}

/* [SAMPLE INPUT OUTPUT]

[INPUT]
2008 2010
3.19 7.44 3.82 7.42 3.99 7.03 2.41 8.17 5.30 10.21 17.82 16.27
4.93 0.75 1.16 3.09 4.53 2.52 7.89 3.74 5.80 3.93 33.19 17.31
4.05 0.47 0.73 2.47 1.00 6.67 3.00 1.06 2.41 10.65 14.17 15.17
2011 2012
15.84 1.80 8.09 1.32 0.43 8.60 6.50 4.29 4.00 10.66 21.43 12.97
8.88 0.17 3.74 2.35 6.65 1.89 3.39 2.21 6.41 2.63 2.93 26.58
0 0

[OUTPUT]
Case #1:
Year 2008: Avg: 7.76 Lo: Jul Hi: Nov
Year 2009: Avg: 7.40 Lo: Feb Hi: Nov
Year 2010: Avg: 5.15 Lo: Feb Hi: Dec
Case #2:
Year 2011: Avg: 7.99 Lo: May Hi: Nov
Year 2012: Avg: 5.65 Lo: Feb Hi: Dec

*/
