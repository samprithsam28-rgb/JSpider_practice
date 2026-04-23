//count Odd Number
public class How_many_Odd_Number_present {

	public static void main(String[] args) 
	{
		int n = 1234567;
		System.out.println(countOdd(n));
		
		

	}
	public static int countOdd(int n)
	{
		int count = 0;
		
		while(n > 0)
		{
			int digit = n % 10 ;
			
			if(digit % 2 != 0)
			{
				count++;
			}
			
			n = n / 10;
		}
		return count;
	}

}
