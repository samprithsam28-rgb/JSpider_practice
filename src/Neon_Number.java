public class Neon_Number {

	public static void main(String[] args) 
	{
		int n = 10;
		
		if(isNeon(n))
			System.out.println("Neon Number");
		else
			System.out.println("Not Neon Number");
	}
	
	public static boolean isNeon(int n)
	{
		int square = n * n ;
		int sum = 0;
		
		while(square > 0)
		{
			int digit = square % 10;
			
			sum = sum + digit;
			
			square = square / 10;
		}
		return sum == n;

	}
	
}
