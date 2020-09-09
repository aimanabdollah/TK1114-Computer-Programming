import java.util.Scanner;
public class A_ZeroRowsCols{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sizeBoard = sc.nextInt();
        int countCase =0;
        
        do {
        	int[][] arrSize = new int[sizeBoard][sizeBoard];

        	countCase++;
        	
        	for(int rows = 0; rows<sizeBoard; rows++) {
        		for(int cols = 0; cols<sizeBoard; cols++) {
        			arrSize[rows][cols] = sc.nextInt();
        		}
        	}
        	
        	System.out.println("Case #" +countCase+ ":");
        	
        	//Calculates sum of row and find which row that sum is zero
        	for(int rows = 0; rows<sizeBoard; rows++) {
        		int sumRows = 0;
        		for(int cols = 0; cols<sizeBoard; cols++) {
        			sumRows = sumRows + arrSize[rows][cols];
        		}
        		if(sumRows == 0) {
        			System.out.println("row "+(rows+1));
        		}	
        	}
        	
        		
        	//Calculates sum of column and find which cols that sum is zero
        	for(int cols = 0; cols<sizeBoard; cols++) {
        		int sumCols = 0;
        		for(int rows = 0; rows<sizeBoard; rows++) {
        			sumCols = sumCols + arrSize[rows][cols];
        		}
        		if(sumCols == 0) {
        			System.out.println("column "+(cols+1));
        		}	
        	}
        	
        	 sizeBoard = sc.nextInt();
        	
        } while(sizeBoard!=0);
        		
      
    }
}