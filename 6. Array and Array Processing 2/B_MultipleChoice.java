import java.util.Scanner;
public class B_MultipleChoice
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int noStud = sc.nextInt();
		int testCase = 1;
		
		while (noStud!=0) {
			char[] answers = {'D','B','D','C','C','D','D','A','E','A','D'};
        
			char[][] size = new char[noStud][10];
			double totalMarks = 0;
			
			System.out.println("Case #" +testCase+ ": ");
			
			for(int i=0; i<noStud; i++)
			{
				double marks = 0.0;
				for (int j=0; j<10; j++)
				{
					size[i][j] = sc.next().charAt(0);
        		
					if(size[i][j]==answers[j])
						marks = marks + 1.00;
					else
						marks = marks - 0.25;
					totalMarks = totalMarks + marks;
				}
        	
				System.out.println("Student's " + (i+1) + " correct answers are " + totalMarks);
			}
			
			noStud = sc.nextInt();
			testCase++;
  
		}	
	}
}
