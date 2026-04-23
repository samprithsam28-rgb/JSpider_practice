
public class inbuilt_palindrome_or_not_using_string {
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
		return s.equals(new StringBuffer(s).reverse().toString());
	}
}
