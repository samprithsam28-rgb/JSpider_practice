
public class Spy_Number {

	public static void main(String[] args) 
	{
		int n = 22;
		
		if(isSpy(n))
		{
			System.out.println("Spy Number");
		}
		else
		System.out.println("Not Spy Number");
	}
	public static boolean isSpy(int n)
	{
		int sum = 0;
		int prod = 1;
		
		while(n>0)
		{
			int digit = n % 10;
			sum =sum + digit;
			prod = prod * digit;
			n= n / 10;
			
			
		}
		
		return sum == prod;
	}

}
