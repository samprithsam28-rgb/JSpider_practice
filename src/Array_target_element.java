public class Array_target_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {40, 10 , 20, 50};

		int target = 20;

		int index=linearSearch(target, a);
		if(index == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("found  in index:" +" "+index);
		}
	}
	public static int  linearSearch(int target,int a[])
	{
		for(int i = 0; i<= a.length-1; i++)
		{
			if(a[i] == target)
				return i;
		}
		return -1;
	}
}
