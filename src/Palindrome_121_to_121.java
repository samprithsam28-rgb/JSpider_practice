
public class Palindrome_121_to_121 {

	private static boolean palindrome;
	public static void main(String[] args) 
	{
		int n = 122;
		if( isPalindrome(n))
		
		System.out.println("Palindromme number");
		else
			System.out.println("Not palindrome Number");
	}
	public static boolean isPalindrome(int n)
	{
		int originalNumber = n;
		int rev = 0;
		
		while(n>0)
		{
			int digit = n % 10;
			
			rev = rev * 10 + digit;
			
			n = n / 10;
			
		}
		
		return originalNumber == rev;
		
		
	}

}
