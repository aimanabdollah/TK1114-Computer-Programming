import java.util.Scanner;
public class E_Palindrome {
	static boolean isPalindrome(String str)
	{
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
  

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] str = new String[n];
		for (int i=0;i<n;i++)
		{
			str[i] = input.next(); 
		}
		
		for (int i=0;i<n;i++)
		{
			System.out.print("Case #"+ (i+1) +": ");
			if (isPalindrome(str[i].toLowerCase()))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}