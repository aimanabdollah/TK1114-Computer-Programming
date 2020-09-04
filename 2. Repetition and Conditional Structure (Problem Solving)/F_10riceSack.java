import java.util.Scanner;
public class F_10riceSack {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, max;
		
		N =sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			int count = 1;
			int temp = 0;
			while (count<= 10) {
				int weight = sc.nextInt();
				
				if (temp < weight)
					max = weight;
				else
					max = temp;
				
				temp = max;
				count++	;
			}
			System.out.println("Case #" +i+ ": "+temp);
		}		
	}
}

/*
3
9 15 25 1 6 10 5 20 3 18
Case #1: 25
5 10 25 3 1 30 15 5 1 8
Case #2: 30
7 4 20 50 5 10 35 64 11 5
Case #3: 64

*/