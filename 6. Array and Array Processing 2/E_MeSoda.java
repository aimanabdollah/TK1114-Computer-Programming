import java.util.Scanner;
import java.text.DecimalFormat;
public class E_MeSoda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int noRespondent;
        int countCase = 0;
        // Input the number of respondent
    	noRespondent = sc.nextInt();
        
        do {
        	countCase ++;
        	
        	int[][] result = new int[noRespondent][4];
        	
        	for (int i=0; i<noRespondent; i++) {
        		for (int j=0; j<4; j++) {
        			result[i][j] = sc.nextInt();
        		}     		
        	}
        	
        	System.out.println("Case #" +countCase+ ": ");
        	// Find the sum of column
        	for(int j = 0; j<4; j++) {
        		int sumCols = 0;
        		for(int i = 0; i<noRespondent; i++) {
        			sumCols = sumCols + result[i][j];
        		
        		}
        		double average = sumCols / (double) noRespondent;
        		System.out.println("Soda-" +(j+1)+ ": " +df.format(average));
 
        	}
     
        	noRespondent = sc.nextInt(); 	
        } while(noRespondent != 0);
    }
}
  

/* [SAMPLE INPUT OUTPUT]

[INPUT]			   
2 
4 1 5 1 
4 4 1 2 
5
1 1 4 3 
3 5 1 3 
1 4 4 3 
1 2 3 5 
3 3 5 4 
10
3 2 3 1
4 4 5 1
5 3 4 1
2 4 5 1
1 3 5 3
4 3 3 2
3 2 2 1
2 1 5 3
4 2 5 2
4 2 5 3
0

[OUTPUT]
Case #1: 
Soda-1: 4.00
Soda-2: 2.50
Soda-3: 3.00
Soda-4: 1.50
Case #2: 
Soda-1: 1.80
Soda-2: 3.00
Soda-3: 3.40
Soda-4: 3.60
Case #3: 
Soda-1: 3.20
Soda-2: 2.60
Soda-3: 4.20
Soda-4: 1.80

*/