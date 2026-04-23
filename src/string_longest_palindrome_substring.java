
public class string_longest_palindrome_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcba";
		String longest ="";
		
		for(int i=0; i<=s.length()-1; i++)
		{
			for(int j = 0; j<=s.length(); j++)
			{
				String sub = s.substring(i,j);
				if(isPalindrome(sub))
			{
				if(sub.length() > longest.length())
					longest = sub;
			}
		}

	}
		System.out.println(longest);
}
	public static boolean isPalindrome(String s)
	{
		 s.return =new StringBuffer(s).reverse().toString();
	}
	}
