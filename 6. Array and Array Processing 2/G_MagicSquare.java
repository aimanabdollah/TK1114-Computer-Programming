import java.util.Scanner;
public class G_MagicSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for(int i=1; i<=testCase; i++) {
        	
        	int n = 3;
        	int m;
        	int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        	int sumD1 = 0, sumD2 = 0;
        	m = (n*((n*n)+1)/2);
        	
        	int[][] arrSize = new int[n][n];
        	
        	// Input the value to fill the square
        	for(int rows=0; rows<n; rows++) {
        		for(int cols=0; cols<n; cols++) {
        			arrSize[rows][cols] = sc.nextInt();
        		}
        	}
        	
        	// Find the sum of rows
        	for(int rows = 0; rows<n; rows++) {
        		int sumRows = 0;
        		for(int cols = 0; cols<n; cols++) {
        			sumRows = sumRows + arrSize[rows][cols];
        		}
        		if(sumRows == m) {
        			count1++;
        		}	
        	}
        	 
        	// Find the sum of column
        	for(int cols = 0; cols<n; cols++) {
        		int sumCols = 0;
        		for(int rows = 0; rows<n; rows++) {
        			sumCols = sumCols + arrSize[rows][cols];
        		}
        		if(sumCols == m) {
        			count2++;
        		}	
        	}
        	
        	for(int rows = 0; rows<n; rows++) {
        		for(int cols = 0; cols<n; cols++) {
        			
        			// Find sum of d1
        			if (rows == cols) {
        				sumD1 = sumD1 + arrSize[rows][cols];
        				if (sumD1 == m)
        					count3++;
        			}
        			
        			// Find sum of d2
        			if (rows == n - cols - 1) {
        				sumD2 = sumD2 + arrSize[rows][cols];
        				if (sumD2 == m)
        					count4++;
        			}
        		}
        	}
        	        	
        	if(count1==count2 && count3==count4)
        		System.out.println("Case #"+i+": Yes");
        	else
        		System.out.println("Case #"+i+": No");
        	            	
        }
    }
}

/* [SAMPLE INPUT OUTPUT]

[INPUT]			    [OUTPUT]
3			     	Case #1: Yes
2 7 6		        Case #2: Yes
9 5 1				Case #3: No
4 3 8				
8 1 6 
3 5 7 
4 9 2
1 8 6 
3 7 5 
4 9 2

*/