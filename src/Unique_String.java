
public class Unique_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcd";

		if(isUnique(s))

		{
			System.out.println("unique");
		}
	}

}
public static boolean isUnique (String s)
{
	for(int i=0;i <= s.length()-1; i++)
	{
		for(int j=i+1; j<=s.length()-1; j++)
		{
			if(s.charAt(i) == s.charAt(j))
				return false;

		}
	}
	return true;
}
