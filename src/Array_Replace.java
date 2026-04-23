import java.util.Arrays;

public class Array_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {34,12,45};
		
		//s1->access the element one by one
//		s2->make the sum of the digits
//		 s3-> write the else was present
		System.out.println();
		
		for(int i = 0;i<=a.length-1; i++) // 0<=2
		{
			a[i] = sumOfDigits(a[i]);   // 3+4=7 store in a[i]
			System.out.println(Arrays.toString(a));
		}
	}
	public static int sumOfDigits(int n)    //34
	{
		int sum =0;
		while(n>0)
		{
			sum = sum+n%10;
			n = n / 10;
		}
		return sum;
	}

}
