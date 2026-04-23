
public class Find_alphabet_digit_spacial_character {

	public static void main(String[] args) 
	{
		
		String s = "abc@123";
		
		int ac=0, dc=0,sc=0;
		
		for(int i=0; i<=s.length()-1; i++)
		{
		
		char ch = s.charAt(i);
		
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			ac++;
		else if(ch>='0' && ch<='9')
			dc++;
		else
			sc++;
		}
		
		System.out.println("no of alphabet:"+ac);
		System.out.println("no of dig:"+dc);
		System.out.println("no of spacial:"+sc);
	}
	
	
}

	


