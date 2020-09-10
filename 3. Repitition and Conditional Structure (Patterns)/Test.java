import java.util.Scanner;
public class Test
{	
	public static void firstPattern(int n){
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<=i;j++)
	        {
	            System.out.print(j+1);
	        }
	        System.out.println();
	    }
	}
	
	public static void secondPattern(int n){
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<=i;j++)
	        {
	            System.out.print(i+1);
	        }
	        System.out.println();
	    }
	}
	
	public static void thirdPattern(int n){
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n-i;j++)
	        {
	            System.out.print(j+1);
	        }
	        System.out.println();
	    }
	}
	
	public static void forthPattern(int n){
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n-i;j++)
	        {
	            System.out.print(n-i);
	        }
	        System.out.println();
	    }
	}
	
	public static void fifthPattern(int n)
	{
	    for(int i=0;i<n;i++)
	    {
	        int a = n;
	        for(int j = 0; j<2*n; j++)
	        {
	            if(j >= n-1-i && j<= n-1+i)
	                System.out.print(a);
	            else
	                System.out.print(" ");
	            if(j < n-1)
	                a--;
	            else 
	                a++;
	        }
	        System.out.println();
	    }
	}
	
		public static void sixthPattern(int n)
	{
	    for(int i=0;i<n;i++)
	    {
	        for(int j = 0; j<2*n; j++)
	        {
	            if(j >= n-1-i && j<= n-1+i)
	                System.out.print(i+1);
	            else
	                System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
	
	public static void seventhPattern(int n)
	{
	    for(int i=0;i<n;i++)
	    {
	        int a = n;
	        for(int j = 0; j<2*n-1; j++)
	        {
	            if(j >= i && j<= 2*n-2-i)
	                System.out.print(a);
	            else
	                System.out.print(" ");
	            if(j < n-1)
	                a--;
	            else 
	                a++;
	        }
	        System.out.println();
	    }
	}
	
	public static void eigthPattern(int n)
	{
	    for(int i=0;i<n;i++)
	    {
	        for(int j = 0; j<2*n-1; j++)
	        {
	            if(j >= i && j<= 2*n-2-i)
	                System.out.print(n-i);
	            else
	                System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
	
	public static void menu()
	{
	    System.out.println("Welcome to the number\'s triangle:");
	    System.out.println("\nPattern 1");
	    firstPattern(3);
	    System.out.println("\nPattern 2");
	    secondPattern(3);
	    System.out.println("\nPattern 3");
	    thirdPattern(3);
	    System.out.println("\nPattern 4");
	    forthPattern(3);
	    System.out.println("\nPattern 5");
	    fifthPattern(3);
	    System.out.println("\nPattern 6");
	    sixthPattern(3);
	    System.out.println("\nPattern 7");
	    seventhPattern(3);
	    System.out.println("\nPattern 8");
	    eigthPattern(3);
	    System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int n,patternNo;
		String choice = "Y";
		
		menu();
		
		while(choice.equals("Y"))
		{
    		
    		System.out.println("Which pattern you want to print? ");
    		patternNo = scnr.nextInt();
    		
    	    System.out.println("How many row would you like to print?");
    	    n = scnr.nextInt();
    	    System.out.println();
    	    
    	    if(patternNo == 1)
    	        firstPattern(n);
    	    else if(patternNo == 2)
    	        secondPattern(n);
    	    else if(patternNo == 3)
    	        thirdPattern(n);
    	    else if(patternNo == 4)
    	        forthPattern(n);
    	    else if(patternNo == 5)
    	        fifthPattern(n);
    	    else if(patternNo == 6)
    	        sixthPattern(n);
    	    else if(patternNo == 7)
    	        seventhPattern(n);
    	    else if(patternNo == 8)
	            eigthPattern(n);
	       
    	   System.out.println("-----------------------------------------------");
	       System.out.println("Enter Y to continue or N to exit the program");
	       choice = scnr.next();
	       System.out.println();
		}
		System.out.println("Bye!!...");
	}
}
