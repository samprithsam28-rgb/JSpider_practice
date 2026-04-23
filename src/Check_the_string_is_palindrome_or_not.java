//not recommended
public class Check_the_string_is_palindrome_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";
		
		if(isPallindrome(s))
		{
			System.out.println("pallindrome");
			
		}
		else
			System.out.println("not Pallindrome");

	}
	
	public static boolean isPallindrome(String s)
	{
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			rev = rev +ch;
			
		}
		return s.equals(rev);
		
	}

}
