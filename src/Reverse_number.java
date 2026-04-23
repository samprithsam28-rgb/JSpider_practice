
public class Reverse_number {

	public static void main(String[] args) 
	{
		int n = 1234;

		System.out.println(isReverse(n));

	}
	public static int isReverse(int n)
	{
		int rev = 0;

		while( n > 0)
		{
			int digit = n % 10;

			rev = rev * 10 + digit;

			n = n / 10;

		}
		return rev;
	}

}
