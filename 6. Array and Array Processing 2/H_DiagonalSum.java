import java.util.Scanner;
public class H_DiagonalSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the square
        int sizeBoard = sc.nextInt();
        int countCase = 0;
        
        do {
        	int[][] arrSize = new int[sizeBoard][sizeBoard];

        	countCase++;
        	int sumD1 = 0, sumD2 = 0;
        	int sumTotal = 0;
        	
        	for(int rows = 0; rows<sizeBoard; rows++) {
        		for(int cols = 0; cols<sizeBoard; cols++) {
        			
        			// Input the value to fill the square
        			arrSize[rows][cols] = sc.nextInt();
        			
        			// Find sum of d1
        			if (rows == cols)
        				sumD1 = sumD1 + arrSize[rows][cols];
        			
        			// Find sum of d2
        			if (rows == sizeBoard - cols - 1)
        				sumD2 = sumD2 + arrSize[rows][cols];
        		}
        	}
        	
   
        	// System.out.println(sumD1 +" "+sumD2);
        	
        	sumTotal = sumD1 + sumD2;
        	
        	System.out.println("Case #" +countCase+ ": "+sumTotal);	
            sizeBoard = sc.nextInt();
        	
        } while(sizeBoard!=0); 
  
    }
}

/* [SAMPLE INPUT OUTPUT]
					
[INPUT]			    [OUTPUT]
5					Case #1: 57
1 3 5 7 9			Case #2: 36
2 2 3 4 2
3 6 8 3 4
4 7 2 4 8
5 6 7 8 9
4
1 2 3 4
4 5 6 7
7 8 9 0
0 1 2 3
0

*/

