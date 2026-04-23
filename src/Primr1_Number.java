
public class Primr1_Number {

	public static void main(String[] args) 
	{
		int n = 11;
		
		   boolean result = isprime(n);
		
		if(result == true)
		{
			System.out.println("Prime Number");
		}
		else
			System.out.println("Not a Prime Number");
	}

public static boolean isprime(int n)
{
	if(n <= 1)
		return false;
	for(int i = 2; i<= n/2; i++)
	{
		if(n % i ==0)
			return false;
	}
	return true;
	}
}
