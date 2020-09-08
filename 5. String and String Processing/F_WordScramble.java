import java.util.*;
public class F_WordScramble
{
	public static String reverseString(String str)
	{
		//StringBuilder is a mechanism to make changes to strings
		//it helps in reversing a string using reverse inbuilt function
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		//again convert it to string using toString function to append there
		return sb.toString();
	}
  
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		int i,j;
		String str1,result;
		for(i=0;i<n;i++)
		{
			//read the string
			str1=s.nextLine();
			result="";
			//split the string at space
			String[] arrStr=str1.split(" ");
			//reverse each and every word except last #
			for(j=0;j<arrStr.length-1;j++)
			{
				//call reverse function and append to result
				result+=reverseString(arrStr[j])+" ";
			}
			System.out.println("Case #"+(i+1)+":"+result);
		}
  
	}
}