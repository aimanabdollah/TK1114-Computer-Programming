import java.util.Scanner;
public class I_FinalGrade
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int quiz, assignment, finalExam, finalGrades;
		char grade;
		
		int student=sc.nextInt();
		
		for(int i=1; i<=student; i++)
		{
                    quiz=sc.nextInt();
		    assignment=sc.nextInt();
		    finalExam=sc.nextInt();
		    
		    finalGrades=quiz+assignment+finalExam;
		    
		    if(finalGrades >=90 && finalGrades<=100){
		    	grade='A';
		    	System.out.println("Student #"+i+": "+finalGrades+" "+grade);}
		    else if(finalGrades >=80 && finalGrades<=89){
				grade='B';
				System.out.println("Student #"+i+": "+finalGrades+" "+grade);}
		    else if(finalGrades >=60 && finalGrades<=79){
				grade='C';
				System.out.println("Student #"+i+": "+finalGrades+" "+grade);}
		    else if(finalGrades >=50 && finalGrades<=59){
				grade='D';
				System.out.println("Student #"+i+": "+finalGrades+" "+grade);}
		    else if(finalGrades<50){
				grade='F';
				System.out.println("Student #"+i+": "+finalGrades+" "+grade);}
	            else
				break;
		}
	}
}
		    	
			
	
