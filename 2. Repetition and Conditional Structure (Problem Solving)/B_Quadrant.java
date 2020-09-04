import java.util.Scanner;
public class B_Quadrant {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			int x, y;
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			if(x == 0 || y == 0)
				System.out.println("Case #" +i+ ": AXIS");
			else if( x>0 && y>0)
				System.out.println("Case #" +i+ ": Q1");
			else if( x<0 && y>0)
				System.out.println("Case #" +i+ ": Q2");
			else if( x<0 && y<0)
				System.out.println("Case #" +i+ ": Q3");
			else if( x>0 && y<0)
				System.out.println("Case #" +i+ ": Q4");
	
			}
		}
	}

/*
5
0 0
Case #1: AXIS
0 1
Case #2: AXIS
1 1
Case #3: Q1
3 -3
Case #4: Q4
-2 -5
Case #5: Q3
*/